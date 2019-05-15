package cse.fet.gurukul.Register;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import cse.fet.gurukul.R;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button signup;
    SharedPreferences sp;
    Button forgot;
    EditText em, pass;
    RelativeLayout rellay1, rellay2;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR); //will hide the title

        getSupportActionBar().hide(); // hide the title bar

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_login);
        signup = findViewById(R.id.btn_signup);
        forgot = findViewById(R.id.forgot);
        rellay1 = findViewById(R.id.rellay1);
        rellay2 = findViewById(R.id.rellay2);
        em = findViewById(R.id.etemail);
        pass = findViewById(R.id.etpass);
        handler.postDelayed(runnable, 1000);
        sp = getSharedPreferences("app", MODE_PRIVATE);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(i);
            }
        });


        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, ForgotActivity.class);
                startActivity(i);
            }
        });
    }

    public void login(View v) {
        if (!(em.getText().toString().contains("@") && em.getText().toString().contains("."))) {
            Toast.makeText(LoginActivity.this, "WRONG EMAIL", Toast.LENGTH_LONG).show();
            return;
        }
        try {
            String rs = new Login().execute("").get();
            if (rs.equals("yes"))
                Toast.makeText(LoginActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(LoginActivity.this, "LOGIN UNSUCCESSFUL", Toast.LENGTH_LONG).show();
            finish();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class Login extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                String ConnectionURL = "jdbc:jtds:sqlserver://" + "13.233.225.36" + ":49170;DatabaseName="//",;instance=SQLEXPRESS;DatabaseName="
                        + "Jnanagni" + ";user=" + "root" + ";password=" + "root" + ";";
                Connection con = DriverManager.getConnection(ConnectionURL);
                if (con == null) {
                    Toast.makeText(LoginActivity.this, "Internet connectivity issue", Toast.LENGTH_SHORT).show();
                } else {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select CTID from DETAILS WHERE EMAIL=\'" + em.getText().toString() + "\' AND PASSWORD = \'" + pass.getText().toString() + "\';");
                    if (rs.next()) {
                        SharedPreferences.Editor et = sp.edit();
                        et.putInt("id", rs.getInt(1));
                        et.apply();
                        return "yes";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "no";
        }

        @Override
        protected void onPostExecute(String s) {
            if (s.equals("yes"))
                startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
        }
    }
}

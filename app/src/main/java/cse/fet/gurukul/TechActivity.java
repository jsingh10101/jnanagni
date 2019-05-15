package cse.fet.gurukul;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

//import com.example.gurukul.R;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;

import androidx.appcompat.app.AppCompatActivity;

public class TechActivity extends AppCompatActivity {
    Window window;
    ImageView imageView;
    Button textsummary;
    int id;

    String summary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        imageView = findViewById(R.id.img);
        textsummary = findViewById(R.id.txtsummary);


        summary = getIntent().getStringExtra("summary");

        SharedPreferences sp = getSharedPreferences("app", MODE_PRIVATE);
        id = sp.getInt("id", 0);
        Bundle bundle = this.getIntent().getExtras();
        int pic = bundle.getInt("image");
        imageView.setImageResource(pic);


        textsummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (summary.equals("no"))
                    Toast.makeText(TechActivity.this, "WILL BE UPDATED WITHIN 2-3 DAYS", Toast.LENGTH_SHORT).show();
                else {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(summary));
                    startActivity(intent);
                }

            }
        });


        if (Build.VERSION.SDK_INT >= 22) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.status_bar));
        }

        Toolbar toolbar = findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setTitle(this.getIntent().getStringExtra("name"));
    }

    public void press(View v) throws ExecutionException, InterruptedException {
        String code = this.getIntent().getStringExtra("code");
        if (code.equals("MGE01")) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://pubg.jnanagni.in/"));
            startActivity(intent);
        } else if (code.equals("MGE05")) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://forms.gle/KgFfo5oQLqZMGwCk7"));
            startActivity(intent);
        }
        if (id == 0)
            Toast.makeText(TechActivity.this, "Please login to continue", Toast.LENGTH_SHORT).show();
        else {
            String mn = new Login().execute(code).get();
            if (mn.equals("Y"))
                Toast.makeText(TechActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(TechActivity.this, "Unregistered Successfully", Toast.LENGTH_SHORT).show();

        }
    }

    class Login extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            char c = '6';
            try {

                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                String ConnectionURL = "jdbc:jtds:sqlserver://" + "13.233.225.36" + ":49170;DatabaseName="//",;instance=SQLEXPRESS;DatabaseName="
                        + "Jnanagni" + ";user=" + "root" + ";password=" + "root" + ";";
                Connection con = DriverManager.getConnection(ConnectionURL);
                if (con == null) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(TechActivity.this, "Internet connectivity issue", Toast.LENGTH_SHORT).show();
                        }
                    });

                } else {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM DETAILS WHERE CTID=" + id + " AND " + strings[0] + "=\'Y\';");
                    if (rs.next())
                        c = 'N';
                    else
                        c = 'Y';
                    st.executeUpdate("UPDATE Jnanagni.dbo.DETAILS SET " + strings[0] + " =\'" + c + "\' WHERE CTID=" + id + ";");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return String.valueOf(c);
        }

        @Override
        protected void onPostExecute(String s) {
        }
    }
}

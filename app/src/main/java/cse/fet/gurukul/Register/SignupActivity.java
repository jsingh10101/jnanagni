package cse.fet.gurukul.Register;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import cse.fet.gurukul.R;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;


public class SignupActivity extends AppCompatActivity {
    Button login;
    EditText email, pass, cpass;
    RelativeLayout rellay1;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR); //will hide the title

        getSupportActionBar().hide(); // hide the title bar

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_signup);
        rellay1 = findViewById(R.id.rellay1);
        handler.postDelayed(runnable, 1000);
        login = findViewById(R.id.cont);
        email = findViewById(R.id.eteml);
        pass = findViewById(R.id.etpasw);
        cpass = findViewById(R.id.etconfpass);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(email.getText()) || TextUtils.isEmpty(pass.getText()) || TextUtils.isEmpty(pass.getText())) {
                    Snackbar.make(v, "ONE OR MORE TEXTFIELDS ARE EMPTY. PLEASE FILL THOSE AND CONTINUE", Snackbar.LENGTH_SHORT).show();
                    return;
                }
                if (!pass.getText().toString().equals(cpass.getText().toString())) {
                    Snackbar.make(v, "PASSWORDS MISMATCH", Snackbar.LENGTH_SHORT).show();
                    return;
                }

                Intent i = new Intent(SignupActivity.this, DetailsActivity.class);
                i.putExtra("Details", new String[]{email.getText().toString(), pass.getText().toString()});
                startActivity(i);
                finish();
            }
        });


    }

}
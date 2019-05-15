package cse.fet.gurukul.Register;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import cse.fet.gurukul.R;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    RelativeLayout rellay1;
    EditText name, phone, clg, brn;
    Spinner sd;
    String s[];
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

        setContentView(R.layout.activity_details);
        rellay1 = findViewById(R.id.rellay3);
        handler.postDelayed(runnable, 1000);
        name = findViewById(R.id.etname);
        phone = findViewById(R.id.etphone);
        clg = findViewById(R.id.etcol);
        brn = findViewById(R.id.etbran);
        sd = findViewById(R.id.tsh);
        s = getIntent().getStringArrayExtra("Details");


    }

    public void mons(View v) {
        new Login().execute("");
        Toast.makeText(DetailsActivity.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
        finish();
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
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(DetailsActivity.this, "Internet connectivity issue", Toast.LENGTH_SHORT).show();
                        }
                    });

                } else {
                    Statement st = con.createStatement();
                    st.executeUpdate("insert into Jnanagni.dbo.DETAILS (NAME,EMAIL,[PHONE NUMBER],COLLEGE,BRANCH,PASSWORD,TSHIRT) VALUES (" +
                            "\'" + name.getText().toString() + "\'," +
                            "\'" + s[0] + "\'," +
                            "" + phone.getText().toString() + "," +
                            "\'" + clg.getText().toString() + "\'," +
                            "\'" + brn.getText().toString() + "\'," +
                            "\'" + s[1] + "\'," +
                            "\'" + sd.getSelectedItem() + "\');");
                    ResultSet md = st.executeQuery("select CTID from DETAILS WHERE EMAIL=\'" + s[0] + "\';");
                    if (md.next())
                        new SendMail().execute("" + md.getInt(1));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "no";
        }

        @Override
        protected void onPostExecute(String s) {
            Toast.makeText(DetailsActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
            finish();
        }

    }

    private class SendMail extends AsyncTask<String, Void, Integer> {

        String error = null;
        Integer result;

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();
            /*pd = new ProgressDialog(MainActivity.this);
            pd.setTitle("Sending Mail");
            pd.setMessage("Please wait...");
            pd.setCancelable(false);
            pd.show();*/
        }

        @Override
        protected Integer doInBackground(String... params) {
            // TODO Auto-generated method stub

            MailSender sender = new MailSender();
            sender.setTo(new String[]{s[0]});
            sender.setFrom("noreply@gurukul.ac.in");
            sender.setBody("Greetings from Team Jnanagni," +
                    "\n \n We are pleased to inform you that you hav been sucessfully registered for Jnanagni-2K19 which is going to be held on 15-17 April, 2019." +
                    "\n\n‘Jnanagni’ as it implies ‘Fire of Wisdom’ – is one of the biggest techno-cultural fests amongst colleges in Uttarakhand. It is a platform where young talents from diverse regions come together to showcase their ability, learn and share their experiences with their peers. We aim to celebrate this festival of wisdom, joy and learning with greater enthuse." +
                    "\n\n\t\tYour registration number is JNAN19" + params[0] +
                    ".\nYou can now login  into your profile." +
                    "Please do note that you must pay the registration fees before registering for the events. The payment can be done in the Payment Section of profile page." +
                    "\nIf already paid kindly enter the payment receipt number and the name of collection agent by selecting the \'Paid to Collection Agent\' option" +
                    "\n\n\n\nWe would be glad to meet you at MegaFest." +
                    "\n\nRegards," +
                    "\nTeam Jnanagni" +
                    "\nFaculty of Engineering And Technology," +
                    "\nGurukul Kangri Vishwavidyalaya, Haridwar.");
            try {
                if (sender.send()) {
                    System.out.println("Message sent");
                    return 1;
                } else {
                    return 2;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("SendMail", e.getMessage(), e);
            }

            return 3;
        }


    }
}



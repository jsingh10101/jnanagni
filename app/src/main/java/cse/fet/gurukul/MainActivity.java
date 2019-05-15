package cse.fet.gurukul;


import android.content.Context;
import android.content.Intent;

import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import cse.fet.gurukul.R;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    private VideoView videoView;
    private RelativeLayout rl;
    private ImageView im;
    private TextView t1, t2;
    private static Context c;

    public static Context getC() {
        return c;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c = getApplicationContext();
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full
        setContentView(R.layout.activity_main);

        /*rl=findViewById(R.id.lay);
        im=findViewById(R.id.img);
        final Animation iam= AnimationUtils.loadAnimation(this,R.anim.imageanim);
        final Animation ic=AnimationUtils.loadAnimation(this,R.anim.exit);
        im.setAnimation(iam);
        im.setVisibility(View.VISIBLE);
        AudioManager audioManager= (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int d=audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,d,0);
        t1=findViewById(R.id.textViewjn);
        t2=findViewById(R.id.textView2fr);
        final MediaPlayer mp =MediaPlayer.create(getApplicationContext(),R.raw.typing);
        new Thread(new Runnable() {
            @Override
            public void run() {
                mp.start();
                mp.setLooping(false);
                while (mp.isPlaying()){
                    if(mp.getCurrentPosition()==600){
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                t1.setAnimation(iam);
                                t1.setVisibility(View.VISIBLE);

                            }
                        });
                    }
                    if(mp.getCurrentPosition()==1800){
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                t2.setAnimation(iam);
                                t2.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    if(mp.getCurrentPosition()==(mp.getDuration()-1200))
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                rl.setAnimation(ic);
                            }
                        });

                }

            }
        }).start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent i = new Intent(MainActivity.this, FrontActivity.class);
                startActivity(i);
                finish();
            }
        });*/


        new Handler().postDelayed(new Runnable() {


            // * Showing splash screen with a timer. This will be useful when you
            //* want to show case your app logo / company


            @Override
            public void run() {

                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(MainActivity.this, FrontActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);


    }


}

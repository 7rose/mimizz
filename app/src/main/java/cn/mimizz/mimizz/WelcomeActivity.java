package cn.mimizz.mimizz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
    }

    private void init() {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                WelcomeActivity.this.finish();
            }
        };
        timer.schedule(timerTask, 3000);
    }
}

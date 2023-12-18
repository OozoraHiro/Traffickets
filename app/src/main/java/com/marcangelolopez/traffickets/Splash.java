package com.marcangelolopez.traffickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SharedPreferences v = getSharedPreferences("Onboard", MODE_PRIVATE);
        getSupportActionBar().hide();

        TimerTask timer = new TimerTask() {
            @Override
            public void run() {


                if(v.getBoolean("open", false)){

                    startActivity(new Intent(Splash.this, MainActivity.class));

                }else{
                    startActivity(new Intent(Splash.this, Onboarding.class));
                    v.edit().putBoolean("open", true).apply();
                }


            }
        };
        new Timer().schedule(timer, 2000);
    }
}
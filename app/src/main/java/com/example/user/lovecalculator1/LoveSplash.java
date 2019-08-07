package com.example.user.lovecalculator1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class LoveSplash extends AppCompatActivity {

    private static final int SPLASH_DELAY=1500;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.love_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(LoveSplash.this,MainActivity.class);
                startActivity(intent);

            }


        },SPLASH_DELAY);
    }


}

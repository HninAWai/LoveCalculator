package com.example.user.lovecalculator1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoveCal extends AppCompatActivity {

    private static final int LOADING_TIME = 3000;

    private TextView txvCrushName,txvName,txvPercent;
    private Button btnCalAgain;

    private String crushName;
    private String name;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.love);

            Intent intent = getIntent();
            this.crushName = intent.getStringExtra("crush-name");
            this.name = intent.getStringExtra("name");

            txvCrushName = findViewById(R.id.txvCrushName);
            txvName = findViewById(R.id.txvName);
            txvPercent = findViewById(R.id.txvPercent);
            btnCalAgain = findViewById(R.id.btnCalAgain);


            txvCrushName.setText(crushName);
            txvName.setText(name);

            this.calculateLovePercentage();

            btnCalAgain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        }

        private void calculateLovePercentage() {

            new Handler().postDelayed(new Runnable() {
                @Override
                @SuppressLint("DefaultLocale")
                public void run() {

                    int random = (int) (Math.random() * 50 + 10);
                    txvPercent.setText(String.format("%d%%", random));

                }
            }, LOADING_TIME);
        }
    }

package com.example.user.lovecalculator1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtCrushName;
    private EditText edtName;
    private Button btnCalculate;
    private TextView tvCrushName, tvLove,tvName;
    private String crushName;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCrushName = findViewById(R.id.edCrushName);
        edtName = findViewById(R.id.edName);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvCrushName = findViewById(R.id.tvCrushName);
        tvLove = findViewById(R.id.tvLove);
        tvName=findViewById(R.id.tvName);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isInputOK()){
                Intent intent1 = new Intent(MainActivity.this, LoveCal.class);
                    intent1.putExtra("crush-name", crushName);
                    intent1.putExtra("name", name);
                startActivity(intent1);}



            }


        });
    }

    private boolean isInputOK() {
        boolean ok = true;

        this.crushName = edtCrushName.getText().toString();
        this.name = edtName.getText().toString();

        if (this.crushName.isEmpty()) {
            ok = false;
            edtCrushName.setError("Enter your crush name.");
        }
        if (name.isEmpty()) {
            ok = false;
            edtName.setError("Enter your name.");
        }

        return ok;
    }
        }

package com.prasadkpd.mad_activity_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Addition extends AppCompatActivity {

    TextView num1, num2, resultTxt;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        num1 = findViewById(R.id.txtn1add);
        num2 = findViewById(R.id.txtn2add);
        resultTxt = findViewById(R.id.addResult);
        backBtn = findViewById(R.id.btnBackAdd);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int input1 = bundle.getInt("INPUT_1");
        int input2 = bundle.getInt("INPUT_2");
        int result = bundle.getInt("RESULT");

        num1.setText(input1);
        num2.setText(input2);
        resultTxt.setText(result);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });

    }
}
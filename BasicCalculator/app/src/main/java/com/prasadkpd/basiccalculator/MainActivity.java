package com.prasadkpd.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button add, sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        num1 = findViewById(R.id.inp1);
        num2 = findViewById(R.id.inp2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int input1 = Integer.valueOf(num1.getText().toString());
                int input2 = Integer.valueOf(num2.getText().toString());
                int result = input1 + input2;

                Intent intent = new Intent(getApplicationContext(), Addition.class);
                Bundle bundle = new Bundle();
                bundle.putInt("INPUT_1", input1);
                bundle.putInt("INPUT_2", input2);
                bundle.putInt("RESULT", result);

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int input1 = Integer.valueOf(num1.getText().toString());
                int input2 = Integer.valueOf(num2.getText().toString());
                int result = input1 - input2;

                Intent intent = new Intent(getApplicationContext(), Subtraction.class);
                Bundle bundle = new Bundle();
                bundle.putInt("INPUT_1", input1);
                bundle.putInt("INPUT_2", input2);
                bundle.putInt("RESULT", result);

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });




    }


}
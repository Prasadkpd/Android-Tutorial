package com.prasadkpd.tutorial_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Two extends AppCompatActivity {

    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button = findViewById(R.id.btnAct02);
        textView = findViewById(R.id.txtAct02);

        Intent intent = getIntent();
//        String name = intent.getStringExtra("USER_NAME");
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("USER_NAME");
        String city = bundle.getString("USER_CITY");
        textView.setText("Hi " + name + " from " + city);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
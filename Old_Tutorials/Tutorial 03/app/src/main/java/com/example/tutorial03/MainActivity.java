package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button = findViewById(R.id.btnOk);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               txt = findViewById(R.id.txtHello);
               txt.setText("Prasad Lakshan");
           }
       });

    }
}
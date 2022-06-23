package com.example.tutorial06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnone);

        final Intent intent = new Intent(this,MainActivity2.class);
        String name = "Dr. Prasad Lakshan";
        String pos = "Lecture at UCSC";
        //intent.putExtra("USER_NAME",name);
        //intent.putExtra("USER_POS",pos);

        Bundle extras = new Bundle();
        extras.putString("USER_NAME",name);
        extras.putString("USER_POS",pos);

        intent.putExtras(extras);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
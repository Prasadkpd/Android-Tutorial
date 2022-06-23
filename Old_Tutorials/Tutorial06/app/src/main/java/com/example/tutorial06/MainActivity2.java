package com.example.tutorial06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    TextView txtuser,txtpos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.btntwo);
        txtuser = findViewById(R.id.textusername);
        txtpos = findViewById(R.id.textpos);
        Intent intent = getIntent();
        //String name = intent.getStringExtra("USER_NAME");
        //String pos = intent.getStringExtra("USER_POS");

        Bundle extras = intent.getExtras();
        String name = extras.getString("USER_NAME");
        String pos = extras.getString("USER_POS");

        txtuser.setText(name);
        txtpos.setText(pos);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }

        });
    }
}
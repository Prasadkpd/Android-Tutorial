package com.example.tutorial07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    TextView textname,txtpos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn = findViewById(R.id.btntwo);
        textname = findViewById(R.id.txtname);
        txtpos = findViewById(R.id.txtpos);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String name = extras.getString("USER_NAME");
        String pos = extras.getString("USER_POS");

        textname.setText(name);
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
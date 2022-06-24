package com.prasadkpd.tutorial_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnAct01);

        Intent intent = new Intent(getApplicationContext(), Activity_Two.class);
        String name = "Prasad Lakshan";
        String city = "Galle";

//        intent.putExtra("USER_NAME", name);
        Bundle extras = new Bundle();
        extras.putString("USER_NAME", name);
        extras.putString("USER_CITY", city);

        intent.putExtras(extras);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
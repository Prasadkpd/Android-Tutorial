package com.example.tutorial07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

        Intent intent = new Intent(Intent.ACTION_SEND);
        final Intent chooser;
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"someone@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"This is our test Subject");
        intent.putExtra(Intent.EXTRA_TEXT,"This is our text email body");
        intent.setType("text/plain");
        chooser = Intent.createChooser(intent,"Send email test app");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(chooser);
            }
        });
    }
}
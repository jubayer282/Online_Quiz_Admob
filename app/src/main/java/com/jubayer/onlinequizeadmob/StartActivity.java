package com.jubayer.onlinequizeadmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        final AppCompatButton startQuizeBtn = findViewById(R.id.startQuizeBtn);
        final AppCompatButton quitBtn = findViewById(R.id.quitBtn);

        startQuizeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //starting MainActivity
                startActivity(new Intent(StartActivity.this, MainActivity.class));
            }
        });
        quitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //close Activity
                finish();
            }
        });

    }
}
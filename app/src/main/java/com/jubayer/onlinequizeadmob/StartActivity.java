package com.jubayer.onlinequizeadmob;

import static com.jubayer.onlinequizeadmob.R.id.startQuizBtn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        final AppCompatButton startQuizBtn = findViewById(R.id.startQuizBtn);
        final AppCompatButton quitBtn = findViewById(R.id.quitBtn);

        startQuizBtn.setOnClickListener(new View.OnClickListener() {
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
package com.jubayer.onlinequizeadmob;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.MessageDigest;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView quizTimer;
    private RelativeLayout option1Layout, option2Layout, option3Layout, option4Layout;
    private TextView option1TV, option2TV, option3TV, option4TV;
    private ImageView option1Icon, option2Icon, option3Icon, option4Icon;
    private TextView totalQuestionTV;
    private TextView currentQuestionTV;
    private DatabaseReference reference;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizTimer = findViewById(R.id.quizTimer);

        option1Layout = findViewById(R.id.option1Layout);
        option2Layout = findViewById(R.id.option2Layout);
        option3Layout = findViewById(R.id.option3Layout);
        option4Layout = findViewById(R.id.option4Layout);


        option1TV = findViewById(R.id.option1TV);
        option2TV = findViewById(R.id.option2TV);
        option3TV = findViewById(R.id.option3TV);
        option4TV = findViewById(R.id.option4TV);

        option1Icon = findViewById(R.id.option1Icon);
        option2Icon = findViewById(R.id.option2Icon);
        option3Icon = findViewById(R.id.option3Icon);
        option4Icon = findViewById(R.id.option4Icon);

        totalQuestionTV = findViewById(R.id.totalQuestionTV);
        currentQuestionTV = findViewById(R.id.currentQuestionTV);

        reference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://quizappadmob-14f3a-default-rtdb.firebaseio.com/");

        final View nextQuestionBtn = findViewById(R.id.nextQuestionBtn);

    }
}
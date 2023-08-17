package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button multiple= findViewById(R.id.button2);

        Button unica= findViewById(R.id.button);

        Intent question1= new Intent(getApplicationContext(), QuestionOneMultipleActivity.class);

        Intent questionU1= new Intent(getApplicationContext(), QuestionOneUniqueActivity.class);
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(question1);
            }
        });

        unica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(questionU1);
            }
        });

    }
}
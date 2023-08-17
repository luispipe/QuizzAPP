package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionOneUniqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one_unique);

        RadioButton option1= findViewById(R.id.rBtnQ1Opt1);
        RadioButton option2= findViewById(R.id.rBtnQ1Opt2);
        RadioButton option3= findViewById(R.id.rBtnQ1Opt3);
        RadioButton option4= findViewById(R.id.rBtnQ1Opt4);

        Button next= findViewById(R.id.btnQuestionUOne);

        Intent QuestionTwo= new Intent(getApplicationContext(), QuestionTwoUniqueActivity.class);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option1.isChecked()){
                    Toast.makeText(getApplicationContext(),
                            "La respuesta es Correcta",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),
                            "La respuesta es Incorrecta",Toast.LENGTH_LONG).show();

                }

                startActivity(QuestionTwo);

            }
        });

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option2.setChecked(false);
                option3.setChecked(false);
                option4.setChecked(false);
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option1.setChecked(false);
                option3.setChecked(false);
                option4.setChecked(false);
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option2.setChecked(false);
                option1.setChecked(false);
                option4.setChecked(false);
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option2.setChecked(false);
                option3.setChecked(false);
                option1.setChecked(false);
            }
        });



    }
}
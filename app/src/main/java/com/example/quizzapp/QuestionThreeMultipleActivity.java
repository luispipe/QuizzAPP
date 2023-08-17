package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionThreeMultipleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three_multiple);

        CheckBox option1= findViewById(R.id.checkBoxQ3Opt1);
        CheckBox option2= findViewById(R.id.checkBoxQ3Opt2);
        CheckBox option3= findViewById(R.id.checkBoxQ3Opt3);
        CheckBox option4= findViewById(R.id.checkBoxQ3Opt4);
        Button validate= findViewById(R.id.buttonQ3);

        TextView question= findViewById(R.id.textViewQuestionM3);

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Interacción de prueba",Toast.LENGTH_LONG).show();
            }
        });

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option1.isChecked() && !option2.isChecked() &&
                option3.isChecked() && option4.isChecked()){
                    Toast.makeText(getApplicationContext(),"Respuesta Correcta",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Respuesta Incorrecta",Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}
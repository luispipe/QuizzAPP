package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class QuestionTwoMultipleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two_multiple);

        CheckBox option1= findViewById(R.id.checkBoxQ2Op1);
        CheckBox option2= findViewById(R.id.checkBoxQ2Op2);
        CheckBox option3= findViewById(R.id.checkBoxQ2Op3);
        CheckBox option4= findViewById(R.id.checkBoxQ2Op4);

        Button validate= findViewById(R.id.buttonQ2Next);

        Intent question3= new Intent(getApplicationContext(), QuestionThreeMultipleActivity.class);

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (option2.isChecked() && option3.isChecked()
                && !option1.isChecked() && !option4.isChecked()){
                    Toast.makeText(getApplicationContext(),"Respuesta Correcta",Toast.LENGTH_LONG).show();
                }else {
                    option2.setBackgroundColor(Color.GREEN);
                    option3.setBackgroundColor(Color.GREEN);

                    Toast.makeText(getApplicationContext(),"Respuesta Incorrecta",Toast.LENGTH_LONG).show();
                }

                startActivity(question3);
            }
        });

    }
}
package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class QuestionOneMultipleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one_multiple);


        CheckBox option1= findViewById(R.id.checkBox);
        CheckBox option2= findViewById(R.id.checkBox2);
        CheckBox option3= findViewById(R.id.checkBox3);
        CheckBox option4= findViewById(R.id.checkBox4);

        Button validate= findViewById(R.id.button3);

        //Siempre utilizan una intención para ir a otra vista, layout, interfaz
        //El contexto es el lugar, actividad , vista donde estamos
        // para obtener el contexto usamos un getApplicationContext() o un getBaseContext()
        Intent algo= new Intent(getApplicationContext(),QuestionTwoMultipleActivity.class);

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Preguntamos si la respuesta es correcta
                //Sabemos que la respuesta es checkBox 2 y 4
                //Por ende preguntamos que 2 y 4 esten marcadas
                // y 1 y 3 no lo esten ! --> negación la negaación de algo
                // que es verdadero = falso
                if(option2.isChecked() && option4.isChecked() &&
                    !option1.isChecked() && !option3.isChecked()){
                    Toast.makeText(getApplicationContext(),
                            "La respuesta es correcta",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),
                            "La respuesta es incorrecta",Toast.LENGTH_LONG).show();
                }

                startActivity(algo);

            }
        });


    }
}
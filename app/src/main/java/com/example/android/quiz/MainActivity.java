package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.android.quiz.R.id.garage;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view){
        CheckBox garageCheckBox = (CheckBox) findViewById(garage);
        boolean hasGarage = garageCheckBox.isChecked();
        if (hasGarage){
            totalScore = totalScore + 1;
        }

        CheckBox two004CheckBox = (CheckBox) findViewById(R.id.two004);
        boolean hasTwo004 = two004CheckBox.isChecked();
        if (hasTwo004){
            totalScore = totalScore + 1;
        }

        CheckBox graUseIntCheckBox = (CheckBox) findViewById(R.id.graUseInt);
        boolean hasGraUseInt = graUseIntCheckBox.isChecked();
        if (hasGraUseInt){
            totalScore = totalScore + 1;
        }

        CheckBox terabyteCheckBox = (CheckBox) findViewById(R.id.terabyte);
        boolean hasTerabyte = terabyteCheckBox.isChecked();
        if (hasTerabyte){
            totalScore = totalScore + 1;
        }

        CheckBox hyperCheckBox = (CheckBox) findViewById(R.id.hyper);
        boolean hasHyper = hyperCheckBox.isChecked();
        if (hasHyper){
            totalScore = totalScore + 1;
        }

        EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
        name = nameEditText.getText().toString();

        Toast.makeText(MainActivity.this, name + ", you scored " + totalScore + " out of 5", Toast.LENGTH_SHORT).show();
        totalScore = 0;
    }

/*    private void displayName (String name){
        EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
        nameEditText.setText(name);
    }*/


}

package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.quiz.R.id.garage;
import static com.example.android.quiz.R.id.two004;

public class MainActivity extends AppCompatActivity {

    int totalScore;
    String answer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        RadioButton garageRadioButton = (RadioButton) findViewById(garage);
        boolean hasGarage = garageRadioButton.isChecked();
        if (hasGarage) {
            totalScore++;
        }

        RadioButton two004RadioButton = (RadioButton) findViewById(two004);
        boolean hasTwo004 = two004RadioButton.isChecked();
        if (hasTwo004) {
            totalScore++;
        }

        CheckBox monCheckBox = (CheckBox) findViewById(R.id.monday);
        CheckBox friCheckBox = (CheckBox) findViewById(R.id.friday);
        CheckBox satCheckBox = (CheckBox) findViewById(R.id.saturday);
        CheckBox sunCheckBox = (CheckBox) findViewById(R.id.sunday);
        if (satCheckBox.isChecked() && sunCheckBox.isChecked() && !monCheckBox.isChecked() && !friCheckBox.isChecked()) {
            totalScore++;
        }

        EditText nameEditText = (EditText) findViewById(R.id.california);
        answer1 = nameEditText.getText().toString();
        if (answer1.equalsIgnoreCase("California")) {
            totalScore++;
        }

        if (totalScore < 4) {
            Toast.makeText(MainActivity.this, "You scored " + totalScore + " out of 4", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(MainActivity.this, "Amazing! You scored a perfect " + totalScore + " out of 4", Toast.LENGTH_SHORT).show();
        totalScore = 0;
    }

}

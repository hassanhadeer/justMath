package com.cdtechnology.just_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button button_addition;
    private Button button_subtraction;
    private Button button_multiplication;
    private Button button_division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_addition = (Button) findViewById(R.id.button_addition);

        button_subtraction = (Button) findViewById(R.id.button_subtraction);

        button_multiplication = (Button) findViewById(R.id.button_multiplication);

        button_division = (Button) findViewById(R.id.button_division);

    } // onCreate

    public void openAddition (View v){
        Intent goToAddition = new Intent(this, Addition.class);
        startActivity(goToAddition);
    } // openAddition()

    public void openSubtraction(View v){
        Intent intent = new Intent(this, Subtraction.class);
        startActivity(intent);
    } // openSubtraction()

    public void openMultiplication(View v){
        Intent intent = new Intent(this, Multiplication.class);
        startActivity(intent);
    } // openMultiplication()

    public void openDivision(View v){
        Intent intent = new Intent(this, Division.class);
        startActivity(intent);
    } // openDivision()
} // MainActivity
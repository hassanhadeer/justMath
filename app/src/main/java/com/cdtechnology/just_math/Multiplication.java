package com.cdtechnology.just_math;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Multiplication extends AppCompatActivity {

    Button button_checkMultiplication;
    EditText check_input;
    int counter =0;
    int i;
    int a;
    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);
        button_checkMultiplication = findViewById(R.id.button_checkMultiplication);
    } // onCreate

    // create first data and reset when we need it
    public int firstRandom(View v) {

        // to show the start text v  (textViewMultiplication)
        TextView textViewMultiplication = (TextView) findViewById(R.id.textViewMultiplication);
        textViewMultiplication.setVisibility(View.VISIBLE);

        // to hide the onClick text v  (textViewMultiplication)
        TextView textViewMultiplication2 = (TextView) findViewById(R.id.textViewMultiplication2);
        textViewMultiplication2.setVisibility(View.INVISIBLE);

        // reset the value
        counter = 0;

        // get the random numbers
        TextView tv = (TextView) findViewById(R.id.textViewMultiplication);
        Random r = new Random();
        i = r.nextInt(10-1)+1;
        a = r.nextInt(10-1)+1;
        answer = i * a;
        // print the numbers
        tv.setText(Integer.toString(i) + " x " + Integer.toString(a));
        return answer;
    } //firstRandom(View v)  it is the start button , and it will create the first random numbers

    // check the answer
    public void checkAnswer(View v) {

        // to show the text view  (textViewMultiplication2)
        TextView textViewMultiplication2 = (TextView) findViewById(R.id.textViewMultiplication2);
        textViewMultiplication2.setVisibility(View.VISIBLE);

        // get the answer from the edit text (multiplicationAnswer)
        check_input = (EditText) findViewById(R.id.multiplicationAnswer);
        int inputAnswer = Integer.parseInt(check_input.getText().toString());

        // clear the edit text
        check_input.setText("");

        // print the result in the text view correct_answer_multiplication
        TextView tv = (TextView) findViewById(R.id.correct_answer_multiplication);

        // if for the correct answer and else to the wrong answer
        if (inputAnswer == answer) {
            counter++;
            tv.setText("Good job, you have " + counter + " points" );

            // to hide the start text view  (textViewMultiplication)
            TextView textViewMultiplication = (TextView) findViewById(R.id.textViewMultiplication);
            textViewMultiplication.setVisibility(View.INVISIBLE);

            // to get new data in to the (textViewMultiplication2) in order to keep count the points
            TextView tv3 = (TextView) findViewById(R.id.textViewMultiplication2);
            Random r = new Random();
            i = r.nextInt(10-1)+1;
            a = r.nextInt(10-1)+1;
            answer = i * a;
            tv3.setText(Integer.toString(i) + " x " + Integer.toString(a));

        } else {

            // to hide the start text view  (textViewMultiplication)
            TextView textViewMultiplication = (TextView) findViewById(R.id.textViewMultiplication);
            textViewMultiplication.setVisibility(View.INVISIBLE);

            // to get new data in to the (textViewMultiplication2) in order to keep count the points
            tv.setText("the answer is " + Integer.toString(answer));
            TextView tv3 = (TextView) findViewById(R.id.textViewMultiplication2);
            Random r = new Random();
            i = r.nextInt(10-1)+1;
            a = r.nextInt(10-1)+1;
            answer = i * a;
            tv3.setText(Integer.toString(i) + " x " + Integer.toString(a));
        }  //end of  if, else
    } // checkAnswer(View v)
} // end of the class Addition
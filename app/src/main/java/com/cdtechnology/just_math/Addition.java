package com.cdtechnology.just_math;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.Random;

public class Addition extends AppCompatActivity {

    // set what we use
    Button button_checkAdditional;
    EditText check_input;
    int counter =0;
    int i;
    int a;
    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        button_checkAdditional = findViewById(R.id.button_checkAdditional);
    }

    // create first data and reset when we need it
    public int firstRandom(View v) {

        // to show the start text v  (textViewAdditional)
        TextView textViewAdditional = (TextView) findViewById(R.id.textViewAdditional);
        textViewAdditional.setVisibility(View.VISIBLE);

        // to hide the onClick text v  (textViewAdditional)
        TextView textViewAdditional2 = (TextView) findViewById(R.id.textViewAdditional2);
        textViewAdditional2.setVisibility(View.INVISIBLE);

        // reset the value
        counter = 0;

        // get the random numbers
        TextView tv = (TextView) findViewById(R.id.textViewAdditional);
        Random r = new Random();
        i = r.nextInt(100-1)+1;
        a = r.nextInt(100-1)+1;
        answer = i + a;
        // print the numbers
        tv.setText(Integer.toString(i) + " + " + Integer.toString(a));
        return answer;
    } //firstRandom(View v)  it is the start button , and it will create the first random numbers

    // check the answer
    public void checkAnswer(View v) {

        // to show the text v  (textViewAdditional2)
        TextView textViewAdditional2 = (TextView) findViewById(R.id.textViewAdditional2);
        textViewAdditional2.setVisibility(View.VISIBLE);

        // get the answer from the edit text (additionalAnswer)
        check_input = (EditText) findViewById(R.id.additionalAnswer);
        int inputAnswer = Integer.parseInt(check_input.getText().toString());

        // clear the edit text
        check_input.setText("");

        // print the result in the text v correct_answer_additional
        TextView tv = (TextView) findViewById(R.id.correct_answer_additional);

        // if for the correct answer and else to the wrong answer
        if (inputAnswer == answer) {
            counter++;
            tv.setText("Good job, you have " + counter + " points" );

            // to hide the start text v  (textViewAdditional)
            TextView textViewAdditional = (TextView) findViewById(R.id.textViewAdditional);
            textViewAdditional.setVisibility(View.INVISIBLE);

            // to get new data in to the (textViewAdditional2) in order to keep count the points
            TextView tv3 = (TextView) findViewById(R.id.textViewAdditional2);
            Random r = new Random();
            i = r.nextInt(100-1)+1;
            a = r.nextInt(100-1)+1;
            answer = i + a;
            tv3.setText(Integer.toString(i) + " + " + Integer.toString(a));

        } else {

            // to hide the start text v  (textViewAdditional)
            TextView textViewAdditional = (TextView) findViewById(R.id.textViewAdditional);
            textViewAdditional.setVisibility(View.INVISIBLE);

            // to get new data in to the (textViewAdditional2) in order to keep count the points
            tv.setText("the answer is " + Integer.toString(answer));
            TextView tv3 = (TextView) findViewById(R.id.textViewAdditional2);
            Random r = new Random();
            i = r.nextInt(100-1)+1;
            a = r.nextInt(100-1)+1;
            answer = i + a;
            tv3.setText(Integer.toString(i) + " + " + Integer.toString(a));
        } //end of  if, else
    } // checkAnswer(View v)
} //  end of the class Addition


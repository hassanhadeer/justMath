package com.cdtechnology.just_math;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Division extends AppCompatActivity {

    Button button_checkDivision;
    EditText check_input;
    int counter =0;
    int i = 0;
    int a = 0;
    int b =0;
    int answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        button_checkDivision = findViewById(R.id.button_checkDivision);
    }

    // create first data and reset when we need it
    public int firstRandom(View v) {

        // to show the start text v  (textViewDivision)
        TextView textViewDivision = (TextView) findViewById(R.id.textViewDivision);
        textViewDivision.setVisibility(View.VISIBLE);

        // to hide the onClick text v  (textViewDivision)
        TextView textViewDivision2 = (TextView) findViewById(R.id.textViewDivision2);
        textViewDivision2.setVisibility(View.INVISIBLE);

        // reset the value
        counter = 0;

        // get the random numbers
        TextView tv = (TextView) findViewById(R.id.textViewDivision);
        Random r = new Random();
        i = r.nextInt(10-1)+1;
        a = r.nextInt(10-1)+1;
        b = i * a;
        answer = i;
        // print the numbers
        tv.setText(Integer.toString(b) + " / " + Integer.toString(a));

        return answer;
    } //firstRandom(View v)  it is the start button , and it will create the first random numbers

    // check the answer
    public void checkAnswer(View v) {

        // to show the text view  (textViewDivision2)
        TextView textViewDivision2 = (TextView) findViewById(R.id.textViewDivision2);
        textViewDivision2.setVisibility(View.VISIBLE);

        // get the answer from the edit text (divisionAnswer)
        check_input = (EditText) findViewById(R.id.divisionAnswer);
        int inputAnswer = Integer.parseInt(check_input.getText().toString());

        // clear the edit text
        check_input.setText("");

        // print the result in the text view correct_answer_division
        TextView tv = (TextView) findViewById(R.id.correct_answer_division);

        // if for the correct answer and else to the wrong answer
        if (inputAnswer == answer) {
            counter++;
            tv.setText("Good job, you have " + counter + " points" );

            // to hide the start text view  (textViewDivision)
            TextView textViewDivision = (TextView) findViewById(R.id.textViewDivision);
            textViewDivision.setVisibility(View.INVISIBLE);

            // to get new data in to the (textViewDivision2) in order to keep count the points
            TextView tv3 = (TextView) findViewById(R.id.textViewDivision2);
            Random r = new Random();
            i = r.nextInt(10-1)+1;
            a = r.nextInt(10-1)+1;
            b = i * a;
            answer = i;
            // print the numbers
            tv3.setText(Integer.toString(b) + " / " + Integer.toString(a));

        } else {

            // to hide the start text view  (textViewDivision)
            TextView textViewDivision = (TextView) findViewById(R.id.textViewDivision);
            textViewDivision.setVisibility(View.INVISIBLE);

            // to get new data in to the (textViewDivision2) in order to keep count the points
            tv.setText("the answer is " + Integer.toString(answer));
            TextView tv3 = (TextView) findViewById(R.id.textViewDivision2);
            Random r = new Random();
            i = r.nextInt(10-1)+1;
            a = r.nextInt(10-1)+1;
            b = i * a;
            answer = i;
            // print the numbers
            tv3.setText(Integer.toString(b) + " / " + Integer.toString(a));
        } //end of  if, else
    } // checkAnswer(View v)
} // end of the class Division
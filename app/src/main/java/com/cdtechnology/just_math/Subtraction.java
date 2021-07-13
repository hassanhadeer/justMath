package com.cdtechnology.just_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Subtraction extends AppCompatActivity {

    Button button_checkSubtraction;
    EditText check_input;
    int counter =0;
    int i;
    int a;
    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);
        button_checkSubtraction = findViewById(R.id.button_checkSubtraction);
    }

    // create first data and reset when we need it
    public int firstRandom(View v) {

        // to show the start text view  (textViewSubtraction)
        TextView textViewSubtraction = (TextView) findViewById(R.id.textViewSubtraction);
        textViewSubtraction.setVisibility(View.VISIBLE);

        // to hide the onClick text view  (textViewSubtraction)
        TextView textViewSubtraction2 = (TextView) findViewById(R.id.textViewSubtraction2);
        textViewSubtraction2.setVisibility(View.INVISIBLE);

        // reset the value
        counter = 0;

        // get the random numbers
        TextView tv = (TextView) findViewById(R.id.textViewSubtraction);
        Random r = new Random();
        i = r.nextInt(100-1)+1;
        a = r.nextInt(100-1)+1;
        if (i >= a){
            answer = i - a;
            // print the numbers
            tv.setText(Integer.toString(i) + " - " + Integer.toString(a));
        }else {
            answer = a - i;
            // print the numbers
            tv.setText(Integer.toString(a) + " - " + Integer.toString(i));
        }
        return answer;
    } //firstRandom(View v)  it is the start button , and it will create the first random numbers

    // check the answer
    public void checkAnswer(View v) {

        // to show the text view  (textViewSubtraction2)
        TextView textViewSubtraction2 = (TextView) findViewById(R.id.textViewSubtraction2);
        textViewSubtraction2.setVisibility(View.VISIBLE);

        // get the answer from the edit text (subtractionAnswer)
        check_input = (EditText) findViewById(R.id.subtractionAnswer);
        int inputAnswer = Integer.parseInt(check_input.getText().toString());

        // clear the edit text
        check_input.setText("");

        // print the result in the text view correct_answer_subtraction
        TextView tv = (TextView) findViewById(R.id.correct_answer_subtraction);

        // if for the correct answer and else to the wrong answer
        if (inputAnswer == answer) {
            counter++;
            tv.setText("Good job, you have " + counter + " points" );

            // to hide the start text view  (textViewSubtraction)
            TextView textViewSubtraction = (TextView) findViewById(R.id.textViewSubtraction);
            textViewSubtraction.setVisibility(View.INVISIBLE);

            // to get new data in to the (textViewSubtraction2) in order to keep count the points
            TextView tv3 = (TextView) findViewById(R.id.textViewSubtraction2);
            Random r = new Random();
            i = r.nextInt(100-1)+1;
            a = r.nextInt(100-1)+1;

            // to keep the greater number first
            if (i >= a){
                answer = i - a;
                // print the numbers
                tv3.setText(Integer.toString(i) + " - " + Integer.toString(a));
            }else {
                answer = a - i;
                // print the numbers
                tv3.setText(Integer.toString(a) + " - " + Integer.toString(i));
            }

        } else {

            // Get instance of Vibrator from current Context
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            // Vibrate for 1000 milliseconds
            vibrator.vibrate(1000);

            // to hide the start text view  (textViewSubtraction)
            TextView textViewSubtraction = (TextView) findViewById(R.id.textViewSubtraction);
            textViewSubtraction.setVisibility(View.INVISIBLE);

            // to get new data in to the (textViewSubtraction2) in order to keep count the points
            tv.setText("the answer is " + Integer.toString(answer));
            TextView tv3 = (TextView) findViewById(R.id.textViewSubtraction2);
            Random r = new Random();
            i = r.nextInt(100-1)+1;
            a = r.nextInt(100-1)+1;

            // to keep the greater number first
            if (i >= a){
                answer = i - a;
                // print the numbers
                tv3.setText(Integer.toString(i) + " - " + Integer.toString(a));
            }else {
                answer = a - i;
                // print the numbers
                tv3.setText(Integer.toString(a) + " - " + Integer.toString(i));
            }
        } //end of  if, else
    } // checkAnswer(View v)
} // end of the class Addition
package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private static final String LOG_TAG = MainActivity.class.getSimpleName();

        // Question 1
        CheckBox question1_co1;
        CheckBox question1_co2;
        CheckBox question1_co3;
        CheckBox question1_co4;
        // Question 2
        RadioButton question2_co2;
        // Question 3
        EditText question3_answer;
        // Question 4
        RadioButton question4_co3;
        ;
        // Question 5
        RadioButton question5_co4;
        // Question 6
        EditText question6_answer;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void submit_your_answers(View view) {
            CharSequence resultsDisplay;
            Log.e(LOG_TAG, " " + this.findViewById(R.id.question1_co3));
            int answer1_score;
            int answer2_score;
            int answer3_score;
            int answer4_score;
            int answer5_score;
            int answer6_score;
            int final_score;
//------------------------------------------------------------------------------------------
            // Question 1  - Answers are #1 (Larry Page) and #3 (Sergey Brin)
            //------------------------------------------------------------------------------------------
            Boolean answer1_choice1;
            Boolean answer1_choice2;
            Boolean answer1_choice3;
            Boolean answer1_choice4;
            question1_co1 = (CheckBox) this.findViewById(R.id.question1_co1);
            question1_co2 = (CheckBox) this.findViewById(R.id.question1_co2);
            question1_co3 = (CheckBox) this.findViewById(R.id.question1_co3);
            question1_co4 = (CheckBox) this.findViewById(R.id.question1_co4);
            answer1_choice1 = question1_co1.isChecked();
            answer1_choice2 = question1_co2.isChecked();
            answer1_choice3 = question1_co3.isChecked();
            answer1_choice4 = question1_co4.isChecked();
            if (answer1_choice1 && !answer1_choice2 && answer1_choice3 && !answer1_choice4) {
                answer1_score = 1;
            } else {
                answer1_score = 0;
            }

//------------------------------------------------------------------------------------------
            // Question 2 - Answer is #2 (Charles Babbage)
            //------------------------------------------------------------------------------------------
            Boolean answer2;
            question2_co2 = (RadioButton) this.findViewById(R.id.question2_co2);
            answer2 = question2_co2.isChecked();
            if (answer2) {
                answer2_score = 1;
            } else {
                answer2_score = 0;
            }

//------------------------------------------------------------------------------------------
            // Question 3 - Answer is World Wide Web
            //------------------------------------------------------------------------------------------
            String answer3;
            question3_answer = (EditText) this.findViewById(R.id.question3_answer);
            answer3 = question3_answer.getText().toString().toLowerCase();
            if (answer3.equals("World Wide Web")) {
                answer3_score = 1;
            } else {
                answer3_score = 0;
            }

            //-----------------------------------------------------------------------------------
            // Question 4 - Answer is #3 (MSN)
            //-----------------------------------------------------------------------------------
            Boolean answer4;
            question4_co3 = (RadioButton) this.findViewById(R.id.question4_co3);
            answer4 = question4_co3.isChecked();
            if (answer4) {
                answer4_score = 1;
            } else {
                answer4_score = 0;
            }

            //-----------------------------------------------------------------------------------
            // Question 5 - Answer is #4 (URL)
            //-----------------------------------------------------------------------------------
            Boolean answer5;
            question5_co4 = (RadioButton) this.findViewById(R.id.question5_co4);
            answer5 = question5_co4.isChecked();
            if (answer5) {
                answer5_score = 1;
            } else {
                answer5_score = 0;
            }
//------------------------------------------------------------------------------------------
            // Question 6 - Answer is Kevin Systrom
            //------------------------------------------------------------------------------------------
            String answer6;
            question6_answer = (EditText) this.findViewById(R.id.question6_answer);
            answer6 = question6_answer.getText().toString().toLowerCase();
            if (answer6.equals("Kevin Systrom")) {
                answer6_score = 1;
            } else {
                answer6_score = 0;
            }

//------------------------------------------------------------------------------------------
            // Final Score
            //------------------------------------------------------------------------------------------
            final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                    answer6_score ;

            if (final_score == 6) {
                resultsDisplay = "Congratulations! You scored 6 out of 6";
            } else {
                resultsDisplay = "Opps!! Try again. You scored " + final_score + " out of 6";
            }
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, resultsDisplay, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
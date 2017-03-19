package com.agameoffriends.agameoffriends;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Objects;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary questionLibrary = new QuestionLibrary();

    //private TextView mScoreView;
    private TextView mQuestionView;
    private Button nButtonChoice0;
    private Button nButtonChoice1;
    private Button nButtonChoice2;
    private Button nButtonChoice3;

    private String mAnswer = "";
    private int mScore = 0;
    private int mQuestionNumber = 0;
    private int questionLibrarySize = 10;
    private ArrayList<Integer> usedQuestions= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView =(TextView)findViewById(R.id.question);
        nButtonChoice0 = (Button)findViewById(R.id.choice1);
        nButtonChoice1 = (Button)findViewById(R.id.choice2);
        nButtonChoice2 = (Button)findViewById(R.id.choice3);
        nButtonChoice3 = (Button)findViewById(R.id.choice4);

        updateQuestion();

        nButtonChoice0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mQuestionNumber < 5){

                    String newAnswer = nButtonChoice0.getText().toString();
                    System.out.println(newAnswer);
                    questionLibrary.nAnswers.add(newAnswer);
                    updateQuestion();
                }
                else if(mQuestionNumber >= 5 && nButtonChoice0.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateQuestion();
                }
            }
        });

        nButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mQuestionNumber < 5){

                    String newAnswer = nButtonChoice1.getText().toString();
                    System.out.println(newAnswer);
                    questionLibrary.nAnswers.add(newAnswer);
                    updateQuestion();
                }
                else if(mQuestionNumber >= 5 && nButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateQuestion();
                }
            }
        });

        nButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mQuestionNumber < 5){

                    String newAnswer = nButtonChoice2.getText().toString();
                    System.out.println(newAnswer);
                    questionLibrary.nAnswers.add(newAnswer);
                    updateQuestion();
                }
                else if(mQuestionNumber >= 5 && nButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateQuestion();
                }
            }
        });

        nButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mQuestionNumber < 5){

                    String newAnswer = nButtonChoice3.getText().toString();
                    System.out.println(newAnswer);
                    questionLibrary.nAnswers.add(newAnswer);
                    updateQuestion();
                }
                else if(mQuestionNumber >= 5 && nButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateQuestion();
                }
            }
        });
    }

    public void updateQuestion() {
        mQuestionView.setText(questionLibrary.getQuestion(mQuestionNumber));
        nButtonChoice0.setText(questionLibrary.getChoice0(mQuestionNumber));
        nButtonChoice1.setText(questionLibrary.getChoice1(mQuestionNumber));
        nButtonChoice2.setText(questionLibrary.getChoice2(mQuestionNumber));
        nButtonChoice3.setText(questionLibrary.getChoice3(mQuestionNumber));

        if(mQuestionNumber > 4) {
            mAnswer = questionLibrary.getCorrectAnswer(mQuestionNumber - 5);
        }
        usedQuestions.add(mQuestionNumber);
        questionLibrary.nQuestions.remove(mQuestionNumber);
        //questionLibrary.nChoices.
        mQuestionNumber++;




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

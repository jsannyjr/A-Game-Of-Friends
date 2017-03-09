package com.agameoffriends.agameoffriends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary questionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button nButtonChoice0;
    private Button nButtonChoice1;
    private Button nButtonChoice2;
    private Button nButtonChoice3;

    private String nAnswer;
    private int mScore = 0;
    private int mQuestioNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView =(TextView)findViewById(R.id.question);
        nButtonChoice0 = (Button)findViewById(R.id.choice1);
        nButtonChoice1 = (Button)findViewById(R.id.choice2);
        nButtonChoice2 = (Button)findViewById(R.id.choice3);
        nButtonChoice3 = (Button)findViewById(R.id.choice4);
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

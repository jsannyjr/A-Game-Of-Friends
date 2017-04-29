package com.agameoffriends.agameoffriends;


import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity{
    private Button mFinishButton;
    private TextView scoreView;
    private int scoreValue;
    private Bundle bundle;
    private String temp;
    private MediaPlayer scoreBad;
    private MediaPlayer scoreGood;
    private MediaPlayer scorePerfect;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        bundle = getIntent().getExtras();
        scoreValue = bundle.getInt("Score Value");
        scoreView =(TextView)findViewById(R.id.score);
        System.out.println("Check score " + scoreValue);
        scoreView.setText(String.valueOf(scoreValue));

        scoreBad = MediaPlayer.create(ScoreActivity.this, R.raw.badscore);
        scoreGood = MediaPlayer.create(ScoreActivity.this, R.raw.goodscore);
        scorePerfect = MediaPlayer.create(ScoreActivity.this, R.raw.perfectscore);

        if(scoreValue <= 1){
            scoreBad.start();
        }
        else if(scoreValue >= 2 && scoreValue <= 4){
            scoreGood.start();
        }
        else if(scoreValue == 5){
            scorePerfect.start();
        }
        else{

        }
        //openingMusic.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mFinishButton = (Button)findViewById(R.id.finishButton);
        mFinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(ScoreActivity.this, MainActivity.class));
            }
        });

    }
}

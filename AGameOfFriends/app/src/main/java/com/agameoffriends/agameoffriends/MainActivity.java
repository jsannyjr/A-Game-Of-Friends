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

/**
 * Created by Sanny on 4/3/2017.
 */
public class MainActivity extends AppCompatActivity {
    Button mStartButton;
    Button mFinishButon;
    Button mute;
    Button restart;
    MediaPlayer openingMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openingMusic = MediaPlayer.create(MainActivity.this, R.raw.opening2);
        openingMusic.setAudioStreamType(AudioManager.STREAM_MUSIC);
        openingMusic.start();
        mStartButton = (Button)findViewById(R.id.startButton);
        mFinishButon = (Button)findViewById(R.id.ExitButton);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openingMusic.stop();
                //startActivity(new Intent(MainActivity.this, ScoreActivity.class));
                startActivity(new Intent(MainActivity.this, TutorialActivity.class));
            }
        });
        mFinishButon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openingMusic.stop();
                finish();
            }
        });
    }
}

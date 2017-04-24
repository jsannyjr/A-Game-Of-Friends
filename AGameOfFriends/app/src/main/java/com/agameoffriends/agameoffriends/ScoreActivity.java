package com.agameoffriends.agameoffriends;


import android.content.Intent;
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
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        scoreValue = getIntent().getIntExtra("Score Value", 0);
        scoreView =(TextView)findViewById(R.id.score);

        scoreView.setText("5");

        mFinishButton = (Button)findViewById(R.id.finishButton);
        mFinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finish();
                startActivity(new Intent(ScoreActivity.this, MainActivity.class));
            }
        });

    }
}

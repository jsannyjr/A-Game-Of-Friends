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

public class SubActivity extends AppCompatActivity{
    Button mNextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        mNextButton = (Button)findViewById(R.id.nextButton);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                finish();
                //startActivity(new Intent(MainActivity.this, QuizActivity.class));
            }
        });
    }
}

package com.example.basketballscoreapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increasePoints(View view){
        Button button = findViewById(view.getId());
        switch (button.getResources().getResourceEntryName(button.getId())){
            case "teamA2Point": teamAScore+=2; break;
            case "teamA3Point": teamAScore+=3; break;
            case "teamB2Point": teamBScore+=2; break;
            case "teamB3Point": teamBScore+=3; break;
        }
        updateScoreTextViews();
    }

    public void reset(View view){
        teamAScore=0;
        teamBScore=0;
        updateScoreTextViews();
    }

    private void updateScoreTextViews(){
        ((TextView)findViewById(R.id.teamAScore)).setText(""+teamAScore);
        ((TextView)findViewById(R.id.teamBScore)).setText(""+teamBScore);
    }
}
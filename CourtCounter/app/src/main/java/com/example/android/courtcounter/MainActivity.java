package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method for Team A
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        Toast.makeText(this, "Team A Gets 3 Points", Toast.LENGTH_SHORT).show();
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        Toast.makeText(this, "Team A Gets 2 Points", Toast.LENGTH_SHORT).show();
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        Toast.makeText(this, "Team A Gets 1 Point", Toast.LENGTH_SHORT).show();
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //method for Team B
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        Toast.makeText(this, "Team B Gets 3 Points", Toast.LENGTH_SHORT).show();
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        Toast.makeText(this, "Team B Gets 2 Points", Toast.LENGTH_SHORT).show();
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        Toast.makeText(this, "Team B Gets 1 Point", Toast.LENGTH_SHORT).show();
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Reset score team A and score team B to 0
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        Toast.makeText(this, "Score Reset", Toast.LENGTH_SHORT).show();
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

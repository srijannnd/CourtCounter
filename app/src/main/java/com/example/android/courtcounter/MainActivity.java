package com.example.android.courtcounter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Click action for TeamB Out
    public void displayForTeamBOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_out);
        scoreView.setText(String.valueOf("OUT " + score));
    }

    //Click action for TeamA Out
    public void displayForTeamAOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_out);
        scoreView.setText(String.valueOf("OUT " + score));
    }

    //Variables
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int outTeamA = 0;
    int outTeamB = 0;

    //Click action for TeamA plus 3

    public void click3TeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    //click action for TeamA plus 2
    public void click2TeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    //click action for TeamA free throw

    public void clickFreeThrowTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    //click action for TeamA Out
    public void OutTeamA(View view) {
        outTeamA = outTeamA + 1;
        displayForTeamAOut(outTeamA);
    }

    //Click action for TeamB plus 3

    public void click3TeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }

    //click action for TeamB plus 2
    public void click2TeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }

    //click action for TeamB free throw

    public void clickFreeThrowTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    //click action for TeamB Out
    public void OutTeamB(View view) {
        outTeamB = outTeamB + 1;
        displayForTeamBOut(outTeamB);
    }

    //Click action for Reset
    public void reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        outTeamA = 0;
        outTeamB = 0;
        displayForTeamAOut(outTeamA);
        displayForTeamBOut(outTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
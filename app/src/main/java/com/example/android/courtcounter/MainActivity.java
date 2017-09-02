package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teama = 0;
    int teamb = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add_three_showa(View view){
        teama = teama + 3;
        displaya(teama);
    }

    public void add_two_showa(View view){
        teama = teama + 2;
        displaya(teama);
    }

    public void add_one_showa(View view){
        teama = teama + 1;
        displaya(teama);
    }

    public void displaya(int score_a)  {
        TextView textView = (TextView) findViewById(R.id.team_a);
        textView.setText(""+ score_a);


    }


    public void add_three_showb(View view){
        teamb = teamb + 3;
        displayb(teamb);
    }

    public void add_two_showb(View view){
        teamb = teamb + 2;
        displayb(teamb);
    }

    public void add_one_showb(View view){
        teamb = teamb + 1;
        displayb(teamb);
    }

    private void displayb(int score_b)  {
        TextView textView = (TextView) findViewById(R.id.team_b);
        textView.setText(""+ score_b);


    }

    public void reset(View view)  {

        teama = 0;
        teamb = 0;
        displaya(teama);
        displayb(teamb);

    }

}

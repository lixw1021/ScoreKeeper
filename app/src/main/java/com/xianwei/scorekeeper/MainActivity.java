package com.xianwei.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.team_one_score_view) TextView teamOneScoreTv;
    @BindView(R.id.team_one_plus_btn) Button teamOneScorePlusBtn;
    @BindView(R.id.team_one_minus_btn) Button teamOneScoreMinusBtn;
    @BindView(R.id.team_one_set_view) TextView teamOneSetTv;
    @BindView(R.id.team_one_set_plus) TextView teamOneSetPlusBtn;
    @BindView(R.id.team_one_set_minus) TextView teamOneSetMinusBtn;

    @BindView(R.id.team_two_score_view) TextView teamTwoScoreTv;
    @BindView(R.id.team_two_plus_btn) Button teamTwoScorePlusBtn;
    @BindView(R.id.team_two_minus_btn) Button teamTwoScoreMinusBtn;
    @BindView(R.id.team_two_set_view) TextView teamTwoSetTv;
    @BindView(R.id.team_two_set_plus) TextView teamTwoSetPlusBtn;
    @BindView(R.id.team_two_set_minus) TextView teamTwoSetMinusBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    int teamOneScore = 0;
    int teamOneSet = 0;
    int teamTwoScore = 0;
    int teamTwoSet = 0;

    public void teamOneScoreDisplay(int score) {
        teamOneScoreTv.setText(String.valueOf(score));
    }

    public void teamOneSetDisplay(int score) {
        teamOneSetTv.setText(String.valueOf(score));
    }

    public void teamTwoScoreDisplay(int score) {
        teamTwoScoreTv.setText(String.valueOf(score));
    }

    public void teamTwoSetDisplay(int score) {
        teamTwoSetTv.setText(String.valueOf(score));
    }

    @OnClick(R.id.team_one_plus_btn)
    public void teamOneScorePlus() {
        teamOneScore ++;
        teamOneScoreDisplay(teamOneScore);
    }

    @OnClick(R.id.team_one_minus_btn)
    public void teamOneScoreMinus() {
        teamOneScore --;
        if (teamOneScore < 0) {
            teamOneScore = 0;
        }
        teamOneScoreDisplay(teamOneScore);
    }

    @OnClick(R.id.team_one_set_plus)
    public void teamOneSetPlus() {
        teamOneSet ++;
        teamOneSetDisplay(teamOneSet);
    }

    @OnClick(R.id.team_one_set_minus)
    public void teamOneSetMinus() {
        teamOneSet --;
        if (teamOneSet < 0) {
            teamOneSet = 0;
        }
        teamOneSetDisplay(teamOneSet);
    }

    @OnClick(R.id.team_two_plus_btn)
    public void teamTwoScorePlus() {
        teamTwoScore ++;
        teamTwoScoreDisplay(teamTwoScore);
    }

    @OnClick(R.id.team_two_minus_btn)
    public void teamTwoScoreMins() {
        teamTwoScore --;
        if (teamTwoScore < 0) {
            teamTwoScore = 0;
        }
        teamTwoScoreDisplay(teamTwoScore);
    }

    @OnClick(R.id.team_two_set_plus)
    public void teamTwoSetPlus() {
        teamTwoSet ++;
        teamTwoSetDisplay(teamTwoSet);
    }

    @OnClick(R.id.team_two_set_minus)
    public void teamTwoSetMinus() {
        teamTwoSet --;
        if (teamTwoSet < 0) {
            teamTwoSet = 0;
        }
        teamTwoSetDisplay(teamTwoSet);
    }

    @OnClick(R.id.reset)
    public void reset() {
        teamOneScore = 0;
        teamOneSet = 0;
        teamTwoScore = 0;
        teamTwoSet = 0;
        teamOneScoreDisplay(teamOneScore);
        teamOneSetDisplay(teamOneSet);
        teamTwoScoreDisplay(teamTwoScore);
        teamTwoSetDisplay(teamTwoSet);

    }


}

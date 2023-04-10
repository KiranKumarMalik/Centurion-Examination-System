package com.example.relativelayoutloginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class student_home_page extends AppCompatActivity implements View.OnClickListener {

    public CardView exam, notice, result, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home_page);

        exam = (CardView) findViewById(R.id.exam_card);
        notice = (CardView) findViewById(R.id.notice_card);
        result = (CardView) findViewById(R.id.result_card);
        profile = (CardView) findViewById(R.id.profile_card);

        exam.setOnClickListener(this);
        notice.setOnClickListener(this);
        result.setOnClickListener(this);
        profile.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.exam_card:
                i = new Intent(this,student_exam_scheduledtime_page.class);
                startActivity(i);
                break;

//            case R.id.notice_card:
//                i = new Intent(this,student_notices.class);
//                startActivity(i);
//                break;

            case R.id.result_card:
                i = new Intent(this,student_result.class);
                startActivity(i);
                break;

//            case R.id.admit_card:
//                i = new Intent(this,student_admitcard.class);
//                startActivity(i);
//                break;

            case R.id.profile_card:
                i = new Intent(this,student_profile_page.class);
                startActivity(i);
                break;
        }

    }
}
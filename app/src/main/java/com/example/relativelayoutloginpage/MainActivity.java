package com.example.relativelayoutloginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CardView exam, notice, result, admitcard, profile;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_profile);

//        exam = (CardView) findViewById(R.id.exam_card);
//        notice = (CardView) findViewById(R.id.notice_card);
//        result = (CardView) findViewById(R.id.result_card);
//        admitcard = (CardView) findViewById(R.id.admit_card);
//        profile = (CardView) findViewById(R.id.profile_card);



    }
}
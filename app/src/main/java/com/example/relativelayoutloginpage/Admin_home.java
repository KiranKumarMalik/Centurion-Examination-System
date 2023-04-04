package com.example.relativelayoutloginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Admin_home extends AppCompatActivity implements View.OnClickListener{

    public CardView create_exam, notice_card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        create_exam = (CardView) findViewById(R.id.exam_card);
        notice_card = (CardView) findViewById(R.id.notice_card);


        create_exam.setOnClickListener((View.OnClickListener) this);
        notice_card.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.exam_card:
                intent=new Intent(this, admin_create_exam.class);
                startActivity(intent);
                break;

            case R.id.notice_card:
                intent=new Intent(this, notice_admin.class);
                startActivity(intent);
                break;
        }
    }
}
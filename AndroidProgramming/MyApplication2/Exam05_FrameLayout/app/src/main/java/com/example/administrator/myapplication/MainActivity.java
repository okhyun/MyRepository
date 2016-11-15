package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout frame1;
    private LinearLayout frame2;
    private LinearLayout frame3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  /* 메소드는 정의 되어있는것을 객체화 시킨다.*/

        frame1 = (LinearLayout)findViewById(R.id.Frame1);
        frame2 = (LinearLayout)findViewById(R.id.Frame2);
        frame3 = (LinearLayout)findViewById(R.id.Frame3);
    }

    public void onClickFrame1(View view) {
        frame1.setVisibility(View.VISIBLE);
        frame2.setVisibility(View.INVISIBLE);
        frame3.setVisibility(View.INVISIBLE);

    }

    public void onClickFrame2(View view) {
        frame1.setVisibility(View.INVISIBLE);
        frame2.setVisibility(View.VISIBLE);
        frame3.setVisibility(View.INVISIBLE);

    }

    public void onClickFrame3(View view) {
        frame1.setVisibility(View.INVISIBLE);
        frame2.setVisibility(View.INVISIBLE);
        frame3.setVisibility(View.VISIBLE);

    }
}

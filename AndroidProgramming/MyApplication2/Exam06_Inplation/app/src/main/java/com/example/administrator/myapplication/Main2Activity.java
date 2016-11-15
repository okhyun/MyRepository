package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private LinearLayout itemContainer;
    private LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        itemContainer = (LinearLayout)findViewById(R.id.itemContainer);
        layoutInflater = getLayoutInflater();

        fillItems();

    }

    public void fillItems() {
        int[] arrImage = {
                R.drawable.tou1,
                R.drawable.tou2,
                R.drawable.tou3,
                R.drawable.tou4,
                R.drawable.tou5
        };

        String[] arrTitle = {
                "세이나1",
                "세이나2",
                "세이나3",
                "세이나4",
                "세이나5"
        };

        String[] arrContent = {
                "나이:19, 지역:일본, 영어/스페인어/아랍어 가능,        서울 전지역 가이드 가능 ",
                "나이:20, 지역:일본, 영어/스페인어/아랍어 가능,        서울 전지역 가이드 가능 ",
                "나이:21, 지역:일본, 영어/스페인어/아랍어 가능,        서울 전지역 가이드 가능 ",
                "나이:22, 지역:일본, 영어/스페인어/아랍어 가능,        서울 전지역 가이드 가능 ",
                "나이:23, 지역:일본, 영어/스페인어/아랍어 가능,        서울 전지역 가이드 가능 ",
        };

        for(int i=0; i<5; i++) {
            //Inflation
            LinearLayout itemLayout = (LinearLayout) layoutInflater.inflate(R.layout.light_item2, null);

            //Data Setting
            ImageView lightImage = (ImageView) itemLayout.findViewById(R.id.lightImage1);
            lightImage.setImageResource(arrImage[i]);

            TextView lightTitle = (TextView) itemLayout.findViewById(R.id.lightTitle1);
            lightTitle.setText(arrTitle[i]);

            TextView lightContent = (TextView) itemLayout.findViewById(R.id.lightContent1);
            lightContent.setText(arrContent[i]);

            //itemContainer의 내부 객체로 추가
            itemContainer.addView(itemLayout);
        }
    }

}

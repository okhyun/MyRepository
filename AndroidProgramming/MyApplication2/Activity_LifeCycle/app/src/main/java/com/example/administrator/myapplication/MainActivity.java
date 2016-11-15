package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity { //AppCompatActivity은 화면을 만들기 위해 상속받아야한다.
    //생성부터 소멸까지 자동으로 하는것을  Life_Cycle 이라한다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //화면에 어떤내용을 보여줄지가 중요
        super.onCreate(savedInstanceState); //부모의 내용도 필요하고 나의 내용도 반드시 실행해야하기 때문에
        setContentView(R.layout.activity_main); //경로및 파일이름 , 파일의 .xml은 빼고 작성, setContentView은 객체를 만드는 작업을 한다. , 클래스 1개당 .xml 1개씩 연결
        System.out.println("xxxxxx");
        Log.i("mylog", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("mylog", "onStart()");
    } //서비스 실행

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("mylog", "onResume()");
    } //화면을 사용할때(시작)

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("mylog", "onPause()");
    } //화면을 당장 사용할 수 없는 상태일때(일시정지)

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mylog", "onStop()");
    }//서비스 실행 종료

    @Override
    protected void onDestroy() { //onDestroy 소멸될때 실행
        super.onDestroy();
        Log.i("mylog", "onDestroy()");
    }

    public void onClickBtnSecond(View view) {
        Log.i("mylog", "onClickSecond()");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onClickBtnThird(View view) {
        Log.i("mylog", "onClickBtnThird()");
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}

package com.example.dtiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler delayer = new Handler(); //딜레이 변수 생성
        delayer.postDelayed(new Runnable(){
            public void run() {
                Intent intent = new Intent(MainActivity.this, secondscreen.class);
                startActivity(intent); //다음 액티비티 이동
                finish();  //액티비티 종료
            }
        },2000);  //2000은 2초를 의미
    }
}

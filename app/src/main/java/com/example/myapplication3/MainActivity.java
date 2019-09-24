package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //activity_main.xml

        btn=findViewById(R.id.btn_01);
        btn.setText("확인"); //버튼에 이름 부여하기 (바꾸기)
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setText("취소");
                //System.out.println("OnClick..."); //Nooooo!!!
                Log.d("MainActivity","OnClick...."); //mainActivity의 log만 찍겠다
            }
        });

//        btn.setVisibility(View.GONE); //화면에서 버튼이 사라짐(2번 클릭 방지)


    }
}

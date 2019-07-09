package com.tjoeun.resource0621;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("activity 메소드", "메소드 실행");

        Button ani1 = (Button)findViewById(R.id.ani1);
        ani1.setOnClickListener((view)->{
            //애니메이션 가져오기
            Animation scaleanim = AnimationUtils.loadAnimation(
                    MainActivity.this, R.anim.scaleanim);
        //애니메이션 실행
            view.startAnimation(scaleanim);
        });


        Button ani2 = (Button)findViewById(R.id.ani2);
        ani2.setOnClickListener((view)->{
            //애니메이션 가져오기
            Animation setanim = AnimationUtils.loadAnimation(
                    MainActivity.this, R.anim.setanim);
            //애니메이션 실행
            view.startAnimation(setanim);
        });
    }

    //회전 감지 메소드
    //Overriding 할 때 메소드가 추상메소드가 아니라면
    //상위 클래스이 메소드를 호출해 주는 것이 좋습니다.
    @Override
    //오버라이딩을 할 때 메소드가 추상메소드가 아니라면 상위 클래스의 메소드를 호출해주는 것이 좋습니다.
    public void onConfigurationChanged(Configuration newConfig){
        Log.e("회전","회전이 발생하면 호출되는 메소드" + "");
        super.onConfigurationChanged(newConfig);
        Toast.makeText(MainActivity.this, "회전발생", Toast.LENGTH_LONG)
                .show();
    }

}

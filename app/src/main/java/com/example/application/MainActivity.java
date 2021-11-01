package com.example.application;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private View drawerView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.btn_toolbar);

        CardView btn_power = findViewById(R.id.btn_power);
        ImageView btn_timer = findViewById(R.id.btn_timer);
        ImageView btn_rotate = findViewById(R.id.btn_rotate);
        ImageView btn_left = findViewById(R.id.btn_left);
        ImageView btn_right = findViewById(R.id.btn_right);
        TextView tv_temperature = findViewById(R.id.tv_temperature);
        TextView tv_water = findViewById(R.id.tv_water);
        TextView tv_fan = findViewById(R.id.tv_fan);
        SeekBar sb_fan = findViewById(R.id.sb_fan);
        Button btn_menu = findViewById(R.id.btn_menu);
        Button btn_auto = findViewById(R.id.btn_auto);
        Button btn_toolbar = (Button)findViewById(R.id.btn_toolbar);


        btn_toolbar.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                drawerLayout.openDrawer(drawerView);
            }
        });

        btn_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //이부분에 Dialog 구현하시면 됩니다.
            }
        });

        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //이부분에 Dialog 구현하시면 됩니다.
            }
        });

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //이부분에 Dialog 구현하시면 됩니다.
            }
        });

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //이부분에 Dialog 구현하시면 됩니다.
            }
        });

        btn_auto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }

        });

        btn_menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }

        });



        sb_fan.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv_fan.setText("현재 풍량은 " + progress + "입니다.");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        //사이드바 close 버튼 클릭시 행동
        Button btn_close = (Button)findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawers();
            }
        });

        //drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        }) ;


    }

    //사이드바 상태 바뀔때 구현 ... 사이드바 정해진게 없어서 일단 몇가지 만들어 놓음
    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };

}
package com.example.mr.toizone;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen screen = new EasySplashScreen(MainActivity.this)
                .withFullScreen()
                .withBackgroundColor(Color.parseColor("#E8EAF6"))
                .withLogo(R.drawable.toizonelogo)
                .withSplashTimeOut(5000)
                .withTargetActivity(MapsActivity.class);



        View view = screen.create();
        setContentView(view);
    }
}

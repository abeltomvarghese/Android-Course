package com.example.a9fadinganimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isShowing = true;
    public void startFade (View view) {
        ImageView bart = (ImageView) findViewById(R.id.ivBart);
        ImageView homer = (ImageView) findViewById(R.id.ivHomer);
        if (isShowing) {
            isShowing = false;
            bart.animate().alpha(0).setDuration(1000);
            homer.animate().alpha(1).setDuration(2000);
        } else {
            isShowing = true;
            bart.animate().alpha(1).setDuration(2000);
            homer.animate().alpha(0).setDuration(1000);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.example.a10otheranimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void otherAnimate (View view) {
        ImageView bart = (ImageView) findViewById(R.id.ivBart);
        //bart.animate().translationXBy(-1200).setDuration(3000);
        //bart.animate().rotation(360).alpha(0).setDuration(1000);
        //bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
        bart.animate().translationXBy(1000).setDuration(3000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bart = (ImageView) findViewById(R.id.ivBart);
        bart.setX(-1000);
        //bart.animate().translationXBy(1000).rotation(3600).setDuration(2000);
    }
}

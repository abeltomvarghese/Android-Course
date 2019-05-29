package com.example.a4skyswitcher;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void change (View view) {
        ImageView pics = (ImageView) findViewById(R.id.skyViews);
        pics.setImageResource(R.drawable.pic2);
    }
}

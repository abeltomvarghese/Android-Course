package com.example.a7higherlowerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNum();
    }

    public void generateRandomNum() {
        Random rand = new Random();
        answer = rand.nextInt(20) + 1;
    }

    public void calculateChance(View view) {
        EditText guess = (EditText) findViewById(R.id.editTextGuess);
        int inputGuess = Integer.parseInt(guess.getText().toString());
        if (inputGuess > answer) {
            Toast.makeText(this, "lower", Toast.LENGTH_SHORT).show();
        } else if (inputGuess < answer) {
            Toast.makeText(this, "higher", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Well Done!", Toast.LENGTH_SHORT).show();
            generateRandomNum();
        }
    }
}

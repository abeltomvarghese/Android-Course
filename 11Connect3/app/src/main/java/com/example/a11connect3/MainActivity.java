package com.example.a11connect3;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //0:yellow 1:red 2: empty cell
    int activePlayer = 0;
    int[] gameState = {2,2,2,2,2,2,2,2,2};
    int[][] winningPositions = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    boolean hasWon = false;
    boolean drawn = false;

    public void dropIn (View view) {
        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        if (gameState[tappedCounter] == 2 && hasWon == false) {


            gameState[tappedCounter] = activePlayer;
            counter.setTranslationY(-1500);
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.yellow);
                activePlayer = 1;
            } else {
                counter.setImageResource(R.drawable.red);
                activePlayer = 0;
            }
            Button playAgain = (Button) findViewById(R.id.btnPlay);
            TextView message = (TextView) findViewById(R.id.tvWinner);
            counter.animate().translationYBy(1500).rotation(3600).setDuration(400);
            for (int[] position : winningPositions) {
                if (gameState[position[0]] == gameState[position[1]] && gameState[position[1]] == gameState[position[2]] && gameState[position[0]] != 2) {
                    hasWon = true;
                    String winner = "";
                    if (activePlayer == 1) {
                        winner = "yellow";
                    } else {
                        winner = "red";
                    }

                    message.setText(winner + " has won");
                    playAgain.setVisibility(View.VISIBLE);
                    message.setVisibility(View.VISIBLE);

                }
            }
            int drawnCounter = 0;
            for (int index = 0; index < gameState.length; index++) {
                if (gameState[index] != 2) {
                    drawnCounter++;
                }
            }
            if (drawnCounter == 9) {
                drawn = true;
                message.setText("DRAW!");
                playAgain.setVisibility(View.VISIBLE);
                message.setVisibility(View.VISIBLE);
            }
        }
    }
    public void playAgain(View view) {
        Button playAgain = (Button) findViewById(R.id.btnPlay);
        TextView message = (TextView) findViewById(R.id.tvWinner);

        playAgain.setVisibility(View.INVISIBLE);
        message.setVisibility(View.INVISIBLE);
        android.support.v7.widget.GridLayout grid = (android.support.v7.widget.GridLayout) findViewById(R.id.gridLayout);
        for (int i = 0; i<grid.getChildCount();i++){
            ImageView counter = (ImageView) grid.getChildAt(i);
            counter.setImageDrawable(null);
        }
        for (int index = 0; index < gameState.length;index++) {
            gameState[index] = 2;
        }
        activePlayer = 0;
        drawn = false;
        hasWon = false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.example.a8numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void checkType(View view) {
        Log.i("info", "button pressed ");
        EditText input = (EditText) findViewById(R.id.etInput);

        String message;
        if (input.getText().toString().isEmpty()) {
            message = "Please enter a number";
        } else {
            int inputNum = Integer.parseInt(input.getText().toString());
            number myNum = new number(inputNum);
            message = input.getText().toString();
            if (myNum.isSquare() && myNum.isTriangular()) {
                message += " is both a Triangular and Square number";
                //Toast.makeText(this,inputNum + " is both a Triangular and Square number", Toast.LENGTH_SHORT).show();
            } else if (myNum.isTriangular()) {
                message += " is a Triangular number";
                //Toast.makeText(this,inputNum + " is a Triangular number", Toast.LENGTH_SHORT).show();
            } else if (myNum.isSquare()) {
                message += " is a square number";
                //Toast.makeText(this,inputNum + " is a square number", Toast.LENGTH_SHORT).show();
            } else {
                message += " is neither a Triangular or Square Number";
                //Toast.makeText(this, inputNum + " is not a Triangular or Square Number", Toast.LENGTH_SHORT).show();
            }

        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }




}

class number {
    int num;

    public number(int inputNum) {
        this.num = inputNum;
    }

    public boolean isTriangular() {
        double testNum = Math.sqrt(this.num * 2);
        testNum = Math.floor(testNum);
        if ((testNum * (testNum + 1)) / 2 == num) {
            return true;
        }
        return false;
    }

    public boolean isSquare() {
        double squareRoot = Math.sqrt(num);
        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        }

        return false;
    }
}
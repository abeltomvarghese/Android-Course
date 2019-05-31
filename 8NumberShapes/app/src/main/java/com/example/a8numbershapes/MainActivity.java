package com.example.a8numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public int takeInput() {
        EditText input = (EditText) findViewById(R.id.etInput);
        int inputNum = Integer.parseInt(input.getText().toString());

        return inputNum;
    }
    public void checkType(View view) {

        int inputNum = takeInput();
        number myNum = new number(inputNum);
        if (myNum.isSquare() && myNum.isTriangular()) {
            Toast.makeText(this,inputNum + " is both a Triangular and Square numberi", Toast.LENGTH_SHORT).show();
        } else if (myNum.isTriangular()) {
            Toast.makeText(this,inputNum + " is a Triangular number", Toast.LENGTH_SHORT).show();
        } else if (myNum.isSquare()) {
            Toast.makeText(this,inputNum + " is a square number", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, inputNum + " is not a Triangular or Square Number", Toast.LENGTH_SHORT).show();
        }

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
        if ((testNum *(testNum+1))/2 == num) {
            return true;
        }
        return false;
    }
    public boolean isSquare(){
        double squareRoot = Math.sqrt(num);
        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        }

        return false;
    }
}
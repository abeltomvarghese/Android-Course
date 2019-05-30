package com.example.a5currencyconverter;

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
    public void convert (View view) {
        EditText inputConvert = (EditText) findViewById(R.id.editTextConvert);
        String stringNum = inputConvert.getText().toString();
        double num = Double.parseDouble(stringNum);
        double result = num * 1.26;
        String finalResult = String.format("%.2f",result);
        Toast.makeText(this, "£" + stringNum +" is $" + finalResult, Toast.LENGTH_SHORT).show();

    }
}

package com.example.a3loginsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login (View view) {
        EditText userName = (EditText) findViewById(R.id.userName);
        EditText passWord = (EditText) findViewById(R.id.passwordEditText);
        Log.i("Username", userName.getText().toString());
        Log.i("Password", passWord.getText().toString());

    }
}

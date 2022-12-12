package com.example.nabeel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window =this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        getSupportActionBar().hide();

    }

    public void next(View view) {
        Intent intent= new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
        finish();
    }
}
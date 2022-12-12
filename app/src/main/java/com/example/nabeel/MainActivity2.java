package com.example.nabeel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        Window window =this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));


    }

    public void next(View view) {
        Intent intent= new Intent(MainActivity2.this,order_about.class);
        startActivity(intent);
        finish();
    }
}
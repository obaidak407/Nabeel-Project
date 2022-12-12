package com.example.nabeel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class order_about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_about);
        getSupportActionBar().hide();
        Window window =this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));
    }

    public void next(View view) {
        Intent intent = new Intent(order_about.this,order_track.class);
        startActivity(intent);
        finish();
    }
}
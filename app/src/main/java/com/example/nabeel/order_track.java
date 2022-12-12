package com.example.nabeel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

public class order_track extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_track);
        getSupportActionBar().hide();
        Window window =this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));
    }
}
package com.example.nabeel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class order_about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_about);
        getSupportActionBar().hide();
    }

    public void next(View view) {
        Intent intent = new Intent(order_about.this,order_track.class);
        startActivity(intent);
        finish();
    }
}
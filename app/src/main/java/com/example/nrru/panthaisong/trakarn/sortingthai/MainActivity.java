package com.example.nrru.panthaisong.trakarn.sortingthai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // Main Method

    public void clickplay(View view) {

        startActivity(new Intent(MainActivity.this,SortListView.class));
        finish();

    } //clickplay

    public void clickExit(View view) {
        finish();

    }
} // Main Class

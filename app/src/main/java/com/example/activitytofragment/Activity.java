package com.example.activitytofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,new BlankFragment2()).commit();


    }
}
package com.example.splash.splashactivity;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void fg1(View view) {
        android.support.v4.app.FragmentTransaction n = getSupportFragmentManager().beginTransaction();
        n.replace(R.id.frame, new  BlankFragment());
        n.commit();
    }

    public void fg2(View view) {
        android.support.v4.app.FragmentTransaction n = getSupportFragmentManager().beginTransaction();
        n.replace(R.id.frame, new  BlankFragment2());
        n.commit();
    }
}

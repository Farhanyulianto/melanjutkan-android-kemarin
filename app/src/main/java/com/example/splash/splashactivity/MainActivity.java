package com.example.splash.splashactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.splash.splashactivity.activity.AddUserActivity;
import com.example.splash.splashactivity.activity.DetailActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();
        TextView nama = (TextView) findViewById(R.id.user);
        nama.setText(bundle.getCharSequence("nama"));
    }

    public void adduser(View view) {
        Intent intent = new Intent(MainActivity.this, AddUserActivity.class);
        startActivity(intent);
    }

    public void listuser(View view) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(intent);
    }

    public void keyfragment(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);

    }

    public void keyactivity(View view) {
        Intent intent = new Intent(MainActivity.this, Activity_Third.class);
        startActivity(intent);
    }
}

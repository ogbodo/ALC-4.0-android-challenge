package com.example.alcfourchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivityC(View view) {
        Intent activityC = new Intent(this, ActivityC.class);
        startActivity(activityC);

    }

    public void startActivityB(View view) {
        Intent activityB = new Intent(this, ActivityB.class);
        startActivity(activityB);

    }
}

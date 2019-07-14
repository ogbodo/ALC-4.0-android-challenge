package com.example.alcfourchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  aboutALC = findViewById(R.id.about_alc);
        Button  aboutMe = findViewById(R.id.about_me);



    }

    public void startActivityC(View view) {
    }

    public void startActivityB(View view) {
    }
}

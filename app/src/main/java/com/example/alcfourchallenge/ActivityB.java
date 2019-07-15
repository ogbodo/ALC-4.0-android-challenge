package com.example.alcfourchallenge;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_alc);
        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://andela.com/alc/");


    }

}

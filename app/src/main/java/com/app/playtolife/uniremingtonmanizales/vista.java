package com.app.playtolife.uniremingtonmanizales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class vista extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista);

        String uri = getIntent().getStringExtra("uri");

        webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl(uri);
    }
}

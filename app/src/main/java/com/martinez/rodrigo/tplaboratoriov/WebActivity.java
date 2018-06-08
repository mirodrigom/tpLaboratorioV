package com.martinez.rodrigo.tplaboratoriov;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by alumno on 07/06/2018.
 */

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        String s = this.getIntent().getStringExtra("url");
        WebView wv = (WebView)findViewById(R.id.webview);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.loadUrl(s);
        wv.loadData("<h1> hola </h1>","","UTF-8");
    }


}

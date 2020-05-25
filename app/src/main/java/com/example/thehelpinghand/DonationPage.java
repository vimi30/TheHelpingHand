package com.example.thehelpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DonationPage extends AppCompatActivity {

    WebView myBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_page);

        myBrowser = findViewById(R.id.myBrowser);
        myBrowser.setWebViewClient(new WebViewClient());
        myBrowser.loadUrl("file:///android_asset/index.html");

        WebSettings webSettings = myBrowser.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
    @Override
    public void onBackPressed(){
        if(myBrowser.canGoBack())
        {
            myBrowser.goBack();
        }else{
            super.onBackPressed();
        }
    }

}

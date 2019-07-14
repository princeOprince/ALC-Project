package com.prince.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    private WebView alcWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_alc);
        Toolbar alcBar = findViewById(R.id.alc_bar);
        setSupportActionBar(alcBar);
        ActionBar alc = getSupportActionBar();
        alc.setDisplayHomeAsUpEnabled(true);

        alcWebView = findViewById(R.id.webview);
        alcWebView.getSettings().setDomStorageEnabled(true);
        alcWebView.getSettings().setJavaScriptEnabled(true);
        alcWebView.setWebViewClient(new alcWebViewClient());
        alcWebView.loadUrl("https://andela.com/alc/");
    }

    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && alcWebView.canGoBack()) {
            alcWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class alcWebViewClient extends WebViewClient {
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError er) {
            handler.proceed();
            // Ignore SSL certificate errors}
        }
    }

}

package cn.mimizz.mimizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    private WebView mainWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        mainWebView = (WebView) findViewById(R.id.mainWebView);
        mainWebView.getSettings().setJavaScriptEnabled(true);
        mainWebView.setWebViewClient(new WebViewClient());
        mainWebView.loadUrl("https://pt-bay.com");

    }
}

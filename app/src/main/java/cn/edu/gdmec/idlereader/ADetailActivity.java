package cn.edu.gdmec.idlereader;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ADetailActivity extends AppCompatActivity {
    private ImageView iv_back;
    private TextView tv_bar_title;
    private WebView web_View;
    private ProgressBar pb_load;
    private String loadUrl, title;
    private WebViewClient webViewClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adetail);
        loadUrl = getIntent().getStringExtra("url");
        title = getIntent().getStringExtra("title");
        initView();
        setWebViewClient();
    }

    private void setWebViewClient() {
        webViewClient = new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                pb_load.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                pb_load.setVisibility(View.GONE);
            }
        };
        web_View.setWebViewClient(webViewClient);
    }

    private void initView() {
        web_View = (WebView) findViewById(R.id.wb_news);
        web_View.getSettings().setJavaScriptEnabled(true);
        web_View.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        web_View.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        web_View.canGoBack();
        web_View.canGoForward();
        web_View.loadUrl(loadUrl);
        tv_bar_title = (TextView) findViewById(R.id.tv_bar_title);
        tv_bar_title.setText(title);
        iv_back = (ImageView) findViewById(R.id.iv_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        pb_load = (ProgressBar) findViewById(R.id.pb_load);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == event.KEYCODE_BACK && web_View.canGoBack()) {
            web_View.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        web_View.destroy();
    }
}

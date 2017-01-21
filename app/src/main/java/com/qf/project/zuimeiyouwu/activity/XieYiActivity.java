package com.qf.project.zuimeiyouwu.activity;

import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.qf.chenhao.mr_chenlibrary.base.BaseActivity;
import com.qf.project.zuimeiyouwu.R;
import com.qf.project.zuimeiyouwu.util.Constant;

/**
 * Created by Administrator on 2017/1/18.
 */
public class XieYiActivity extends BaseActivity {

    private WebView webView;

    @Override
    protected int getContentId() {
        return R.layout.xieyi_layout;
    }

    @Override
    protected void init() {
        webView = findViewByIds(R.id.webview);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(Constant.XIEYI);
        webView.setWebViewClient(new XieYiClient());
    }

    private class XieYiClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack(); //goBack()表示返回WebView的上一页面
            return true;
        }
        finish();
        return false;
    }

    @Override
    protected boolean isOpenStatus() {
        return false;
    }
}

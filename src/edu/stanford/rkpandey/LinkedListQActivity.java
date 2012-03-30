package edu.stanford.rkpandey;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class LinkedListQActivity extends Activity {
	@Override
	protected void onCreate(Bundle bundle){
		super.onCreate(bundle);
		WebView mWebView = new WebView(this);
		WebSettings webSettings = mWebView.getSettings();
        webSettings.setSavePassword(false);
        webSettings.setSaveFormData(false);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        
        mWebView.loadUrl("file:///android_asset/LLQuestion.html");
        setContentView(mWebView);
	}
}

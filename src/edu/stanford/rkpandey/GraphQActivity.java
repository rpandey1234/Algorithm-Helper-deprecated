package edu.stanford.rkpandey;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class GraphQActivity extends Activity {
	@Override
	protected void onCreate(Bundle bundle){
		super.onCreate(bundle);
		WebView mWebView = new WebView(this);
		WebSettings webSettings = mWebView.getSettings();
        webSettings.setSavePassword(false);
        webSettings.setSaveFormData(false);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        
        
//		TextView textview = new TextView(this);
//        textview.setText("This is the Graph Overview tab");
//        setContentView(textview);
        mWebView.loadUrl("file:///android_asset/GraphQuestion.html");
        setContentView(mWebView);
		
	}
}

package com.mycompany.myapp2;
import android.app.*;
import android.os.*;
import android.webkit.*;
import android.graphics.*;
import android.util.*;
import android.view.*;

public class WebViewActivity extends Activity
{
	private WebView mWvmain;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);
		
		mWvmain = findViewById(R.id.wv);
		//加载本地html
		//mWvmain.loadUrl("file:///android_asset/test1.html");
		//加载网络html
		//需要先设置JavaScript
		mWvmain.getSettings().setJavaScriptEnabled(true);
		//设置app内跳转
		mWvmain.setWebViewClient(new MyWebViewClient());
		//设置进度条和title等
		mWvmain.setWebChromeClient(new MyWebChromeClient());
		//编写js代码方法1
		mWvmain.evaluateJavascript("javascript:alert('hello')",null);
		//用于js调用本地的方法
		//mWvmain.addJavascriptInterface();
		mWvmain.loadUrl("https://m.baidu.com");
		
	}
	//继承并实现app内部跳转
	class MyWebViewClient extends WebViewClient
	{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request)
		{
			// TODO:app内跳转
			view.loadUrl(request.getUrl().toString());
			return true;
		}

		@Override
		public void onPageStarted(WebView view, String url, Bitmap favicon)
		{
			// TODO: 页面加载开始
			super.onPageStarted(view, url, favicon);
			Log.d("WebView","onPageStarted");
			
		}

		@Override
		public void onPageFinished(WebView view, String url)
		{
			// TODO: Implement this method
			super.onPageFinished(view, url);
			Log.d("WebView","onPageFinished");
			//js代码方法2
			//mWvmain.loadUrl("javascript:alert('hello')");
		}
		
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		// TODO: Implement this method
		if(keyCode == KeyEvent.KEYCODE_BACK && mWvmain.canGoBack()){
			mWvmain.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	class MyWebChromeClient extends WebChromeClient
	{

		@Override
		public void onProgressChanged(WebView view, int newProgress)
		{
			// TODO:可利用newProgress(值0～100)设置进度条
			super.onProgressChanged(view, newProgress);
		}

		@Override
		public void onReceivedTitle(WebView view, String title)
		{
			// TODO: Implement this method
			super.onReceivedTitle(view, title);
			setTitle(title);
		}
		
	}
	
	
}

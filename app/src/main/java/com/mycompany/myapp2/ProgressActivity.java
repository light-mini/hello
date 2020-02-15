package com.mycompany.myapp2;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class ProgressActivity extends Activity
{
	private Button btn_start,btnpdialog1,btnpdialog2;
	private ProgressBar pb3;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress);
		
		btn_start = findViewById(R.id.progress_start);
		btnpdialog1 = findViewById(R.id.btn_progress_dialog1);
		btnpdialog2 = findViewById(R.id.btn_progress_dialog2);
		pb3 = findViewById(R.id.pb3);
		btn_start.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					handler.sendEmptyMessage(0);
				}
			});
		btnpdialog1.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					ProgressDialog pd = new ProgressDialog(ProgressActivity.this);
					pd.setTitle("提示");
					pd.setMessage("正在加载");
					pd.show();
				}
			});
		btnpdialog2.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					ProgressDialog pd2 = new ProgressDialog(ProgressActivity.this);
					pd2.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
					pd2.setTitle("提示");
					pd2.setMessage("正在下载");
					pd2.show();
				}
			});
	}
	Runnable runnable = new Runnable(){

		@Override
		public void run()
		{
			// TODO: Implement this method
			pb3.setProgress(pb3.getProgress()+1);
			handler.sendEmptyMessage(0);
		}
	};
	Handler handler = new Handler(){

		@Override
		public void handleMessage(Message msg)
		{
			// TODO: Implement this method
			super.handleMessage(msg);
			if(pb3.getProgress() <100){
				handler.postDelayed(runnable,200);
			}else{
				Toast.makeText(ProgressActivity.this,"Toast",Toast.LENGTH_SHORT).show();
			}
		}
		
	};
	
	
}

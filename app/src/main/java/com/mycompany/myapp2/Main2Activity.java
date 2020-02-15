package com.mycompany.myapp2;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import com.mycompany.myapp2.recycleactivity.*;
import android.view.View.*;

public class Main2Activity extends Activity 
{
	private Button exit,toRecycle,toWeb,toToast,toDialog,
	toProgress,toCustomDialog,toPopupWindow,toLiftcycle;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
		
		toRecycle = findViewById(R.id.mainTo_Recycle);
		
		toRecycle.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Intent intent = new Intent(Main2Activity.this,RecycleViewActivity.class);
					startActivity(intent);
				}
			});
		exit = findViewById(R.id.exit_main);
		toWeb = findViewById(R.id.mainTo_Web);
		toToast = findViewById(R.id.mainTo_Toast);
		toDialog = findViewById(R.id.mainTo_Dialog);
		toProgress = findViewById(R.id.mainTo_Progress);
		toCustomDialog = findViewById(R.id.mainTo_CustomDialog);
		toPopupWindow = findViewById(R.id.mainTo_PopupWindow);
		toLiftcycle = findViewById(R.id.mainTo_liftcycle);

		exit.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					System.exit(0);
				}
			});
		toWeb.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Intent it = new Intent(Main2Activity.this,WebViewActivity.class);
					startActivity(it);
				}
			});
		toToast.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Intent it = new Intent(Main2Activity.this,ToastActivity.class);
					startActivity(it);
				}
			});
		toDialog.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Intent it = new Intent(Main2Activity.this,DialogActivity.class);
					startActivity(it);
				}
			});
		toProgress.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Intent it = new Intent(Main2Activity.this,ProgressActivity.class);
					startActivity(it);
				}
			});
		toCustomDialog.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Intent it = new Intent(Main2Activity.this,CustomDialogActivity.class);
					startActivity(it);
				}
			});
		toPopupWindow.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Intent it = new Intent(Main2Activity.this,PopupWindowActivity.class);
					startActivity(it);
				}
			});
		toLiftcycle.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Intent it = new Intent(Main2Activity.this,LiftCycleActivity.class);
					startActivity(it);
				}
			});
    }
}

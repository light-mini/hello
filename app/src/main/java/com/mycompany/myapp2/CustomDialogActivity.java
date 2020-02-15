package com.mycompany.myapp2;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import com.mycompany.myapp2.widget.*;

public class CustomDialogActivity extends Activity
{
	private Button mBtnDialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_customdialog);
		
		mBtnDialog = findViewById(R.id.customdialog);
		mBtnDialog.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					MyCustomDialog mycustomdialog = new MyCustomDialog(CustomDialogActivity.this);
					mycustomdialog.setTitle("提示").setMessage("确认删除？").setCancel("取消", new MyCustomDialog.IOnCancelLisenner(){

							@Override
							public void OnCancel(MyCustomDialog dialog)
							{
								// TODO: Implement this method
								dialog.dismiss();
							}
						}).setConfirm("确认", new MyCustomDialog.IOnConfirmLisenner(){

							@Override
							public void OnConfirm(MyCustomDialog dialog)
							{
								// TODO: Implement this method
								dialog.dismiss();
							}
						}).show();
				}
			});
	}
	
}

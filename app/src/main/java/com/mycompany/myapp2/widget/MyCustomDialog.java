package com.mycompany.myapp2.widget;
import android.app.*;
import android.content.*;
import android.os.*;
import android.support.annotation.*;
import android.widget.*;
import com.mycompany.myapp2.*;
import android.text.*;
import android.view.View.*;
import android.view.*;
import android.graphics.*;

public class MyCustomDialog extends Dialog implements View.OnClickListener
{
	private TextView mtvtitle,mtvmessage,mtvcancel,mtvconfirm;
	private String title,message,cancel,confirm;
	private IOnCancelLisenner ioncancellisenner;
	private IOnConfirmLisenner ionconfirmlisenner;
	
	public MyCustomDialog(@NonNull Context context){
		super(context);
	}
	public MyCustomDialog(@NonNull Context context,int themeId){
		super(context);
	}

	public MyCustomDialog setTitle(String title)
	{
		// TODO: Implement this method
		//super.setTitle(title);
		this.title = title;
		return this;
	}
	
	public MyCustomDialog setMessage(String message){
		this.message = message;
		return this;
	}
	
	public MyCustomDialog setCancel(String cancel,IOnCancelLisenner cancellisenner){
		this.cancel = cancel;
		ioncancellisenner = cancellisenner;
		return this;
	}
	
	public MyCustomDialog setConfirm(String confirm,IOnConfirmLisenner confirmlisener){
		this.confirm = confirm;
		ionconfirmlisenner = confirmlisener;
		return this;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_custom_dialog);
		
		
		//设置dialog窗口宽度
		WindowManager m = getWindow().getWindowManager();
		Display d = m.getDefaultDisplay();
		WindowManager.LayoutParams p = getWindow().getAttributes();
		Point size = new Point();
		d.getSize(size);
		p.width = (int)( size.x*0.8);//设置宽度为屏幕宽度的80%
		getWindow().setAttributes(p);
		
		
		
		mtvtitle = findViewById(R.id.tv_title);
		mtvmessage = findViewById(R.id.tv_message);
		mtvcancel = findViewById(R.id.tv_cancel);
		mtvconfirm = findViewById(R.id.tv_confirm);
		if(!TextUtils.isEmpty(title)){
			mtvtitle.setText(title);
		}
		if(!TextUtils.isEmpty(message)){
			mtvmessage.setText(message);
		}
		if(!TextUtils.isEmpty(cancel)){
			mtvcancel.setText(cancel);
		}
		if(!TextUtils.isEmpty(confirm)){
			mtvconfirm.setText(confirm);
		}
		mtvcancel.setOnClickListener(this);
		mtvconfirm.setOnClickListener(this);
	}

	@Override
	public void onClick(View p1)
	{
		// TODO: Implement this method
		switch(p1.getId()){
			case R.id.tv_cancel:
				if(ioncancellisenner!=null){
					ioncancellisenner.OnCancel(this);
				}
				break;
			case R.id.tv_confirm:
				if(ionconfirmlisenner!=null){
					ionconfirmlisenner.OnConfirm(this);
				}
				break;
		}
	}
	
	public interface IOnCancelLisenner{
		public void OnCancel(MyCustomDialog dialog);
	}
	public interface IOnConfirmLisenner{
		public void OnConfirm(MyCustomDialog dialog);
	}
	
}

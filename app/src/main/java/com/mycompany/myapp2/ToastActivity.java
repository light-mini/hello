package com.mycompany.myapp2;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class ToastActivity extends Activity
{
	private Button mbtnToast1,mbtnToast2,mbtnToast3;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toast);
		
		mbtnToast1 = findViewById(R.id.btn_toast1);
		mbtnToast2 = findViewById(R.id.btn_toast2);
		mbtnToast3 = findViewById(R.id.btn_toast3);
		
		OnClick onclick = new OnClick();
		mbtnToast1.setOnClickListener(onclick);
		mbtnToast2.setOnClickListener(onclick);
		mbtnToast3.setOnClickListener(onclick);
		
	}
	
	class OnClick implements View.OnClickListener
	{

		@Override
		public void onClick(View p1)
		{
			// TODO: Implement this method
			switch(p1.getId()){
				case R.id.btn_toast1:
					Toast.makeText(getApplication(),"Toast",Toast.LENGTH_SHORT).show();
					break;
				case R.id.btn_toast2:
					Toast toastCenter = Toast.makeText(getApplicationContext(),"居中Toast",Toast.LENGTH_SHORT);
					toastCenter.setGravity(Gravity.CENTER,0,0);
					toastCenter.show();
					break;
				case R.id.btn_toast3:
					Toast toastCustem = new Toast(getApplicationContext());
					LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
					View view = inflater.inflate(R.layout.layout_toast,null);
					ImageView imagev = view.findViewById(R.id.iv_toast);
					TextView textv = view.findViewById(R.id.tv_toast);
					imagev.setImageResource(R.drawable.exit);
					textv.setText("自定义Toast");
					toastCustem.setView(view);
					toastCustem.show();
					break;
					
			}
		}
	}
}

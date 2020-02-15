package com.mycompany.myapp2.Jump;
import android.os.*;
import android.widget.*;
import com.mycompany.myapp2.*;
import android.view.*;
import android.content.*;
import android.app.*;

public class AActivity extends Activity
{
	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_a);
		
		btn = findViewById(R.id.btn_to_b);
		
		btn.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					
//					//显式1
//					Intent it1 = new Intent(getApplicationContext(),BActivity.class);
//					startActivity(it1);
//					//显式2
//					Intent it2 = new Intent();
//					it2.setClass(AActivity.this,BActivity.class);
//					startActivity(it2);
//					//显式3
//					Intent it3 = new Intent();
//					it3.setClassName(AActivity.this,"com.mycompany.myapp2.Jump.BActivity");
//					startActivity(it3);
//					//显式4
//					Intent it4 = new Intent();
//					it4.setComponent(new ComponentName(AActivity.this,"com.mycompany.myapp2.Jump.BActivity"));
//					startActivity(it4);
					//隐式
					Intent it5 = new Intent();
					it5.setAction("android.guangming.BActivity");
					startActivity(it5);
				}
			});
	}
	
}

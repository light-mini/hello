package com.mycompany.myapp2;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.view.View.*;
import com.mycompany.myapp2.Jump.*;

public class MainActivity extends Activity
{
	private Button toUI,jumpA;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		toUI = findViewById(R.id.ui_main);
		jumpA = findViewById(R.id.jumpA);
		
		OnClick onclick = new OnClick();
		toUI.setOnClickListener(onclick);
		jumpA.setOnClickListener(onclick);
			
	}
	class OnClick implements View.OnClickListener
	{
		

		@Override
		public void onClick(View p1)
		{
			// TODO: Implement this method
			Intent it = null;
			switch(p1.getId()){
				case R.id.ui_main:
					it = new Intent(MainActivity.this,Main2Activity.class);
					break;
				case R.id.jumpA:
					it = new Intent(MainActivity.this,AActivity.class);
					break;
			}
			startActivity(it);
		}
	}
	
}

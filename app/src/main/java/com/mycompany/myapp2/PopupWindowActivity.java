package com.mycompany.myapp2;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class PopupWindowActivity extends Activity
{
	private Button btn_pop;
	private PopupWindow pw;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_popup_window);
		
		btn_pop = findViewById(R.id.btn_pop);
		btn_pop.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					View view = getLayoutInflater().inflate(R.layout.layout_pop,null);
					pw = new PopupWindow(view,btn_pop.getWidth(),ViewGroup.LayoutParams.WRAP_CONTENT);
					pw.setOutsideTouchable(true);
					pw.setFocusable(true);
					pw.showAsDropDown(btn_pop);
				}
			});
	}
	
}

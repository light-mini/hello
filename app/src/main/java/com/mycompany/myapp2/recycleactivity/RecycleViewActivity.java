package com.mycompany.myapp2.recycleactivity;
import android.app.*;
import android.os.*;
import android.widget.*;
import com.mycompany.myapp2.*;
import android.view.*;
import android.content.*;
import android.view.View.*;

public class RecycleViewActivity extends Activity
{
	private Button toLview,toHorview,toGridview,toPuview;
	Intent it = null;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recycle_view);
		
		toHorview = findViewById(R.id.to_hor);
		toLview = findViewById(R.id.to_linear);
		toGridview = findViewById(R.id.to_grid);
		toPuview = findViewById(R.id.to_puview);
		
		setListener();
		
		
	}
	private void setListener(){
		Onclick onclick = new Onclick();
		toLview.setOnClickListener(onclick);
		toHorview.setOnClickListener(onclick);
		toGridview.setOnClickListener(onclick);
		toPuview.setOnClickListener(onclick);
	}
	public class Onclick implements View.OnClickListener
	{

		@Override
		public void onClick(View p1)
		{
			// TODO: Implement this method
			switch(p1.getId()){
				case R.id.to_linear:
					it = new Intent(RecycleViewActivity.this,LinearViewActivity.class);
					break;
				case R.id.to_hor:
					it = new Intent(RecycleViewActivity.this,HorizontalViewActivity.class);
					break;
				case R.id.to_grid:
					it = new Intent(RecycleViewActivity.this,GridRecycleViewActivity.class);
					break;
				case R.id.to_puview:
					it = new Intent(RecycleViewActivity.this,PuRecycleViewActivity.class);
					break;
			}
			startActivity(it);
		}
	}
	
}

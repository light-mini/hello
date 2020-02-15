package com.mycompany.myapp2.recycleactivity;
import android.app.*;
import android.os.*;
import com.mycompany.myapp2.*;
import android.support.v7.widget.*;
import android.widget.*;

public class HorizontalViewActivity extends Activity
{
	private RecyclerView mrv1;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recycle_horizental_view);
		
		mrv1 = findViewById(R.id.rv_hor);
		LinearLayoutManager linearlayoutmanager = new LinearLayoutManager(HorizontalViewActivity.this);
		linearlayoutmanager.setOrientation(LinearLayoutManager.HORIZONTAL);
		mrv1.setLayoutManager(linearlayoutmanager);
		mrv1.setAdapter(new HorAdapter(HorizontalViewActivity.this, new HorAdapter.OnItemClickListener(){

								@Override
								public void OnClick(int pos)
								{
									// TODO: Implement this method
									Toast.makeText(HorizontalViewActivity.this,""+pos,Toast.LENGTH_SHORT).show();
								}
							}));
		
	}
	
}

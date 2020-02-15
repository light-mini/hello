package com.mycompany.myapp2.recycleactivity;
import android.app.*;
import android.os.*;
import android.support.v7.widget.*;
import com.mycompany.myapp2.*;
import android.widget.*;

public class GridRecycleViewActivity extends Activity
{
	private RecyclerView mRVGrid;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_recycle_view);
		
		mRVGrid = findViewById(R.id.rv_grid);
		mRVGrid.setLayoutManager(new GridLayoutManager(this,3));
		mRVGrid.setAdapter(new GridAdapter(this, new GridAdapter.OnItemClickListener(){

								   @Override
								   public void OnClick(int pos)
								   {
									   // TODO: Implement this method
									   Toast.makeText(GridRecycleViewActivity.this,pos,Toast.LENGTH_LONG).show();
								   }
							   }));
	}
	
}

package com.mycompany.myapp2.recycleactivity;
import android.app.*;
import android.os.*;
import com.mycompany.myapp2.*;
import android.support.v7.widget.*;
import android.widget.*;

public class PuRecycleViewActivity extends Activity
{
	private RecyclerView mrv1;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pu_recycle_view);
		
		mrv1 = findViewById(R.id.rv_pu);
		mrv1.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL));
		mrv1.setAdapter(new PuAdapter(this, new PuAdapter.OnItemClickListener(){

								@Override
								public void OnClick(int pos)
								{
									// TODO: Implement this method
									Toast.makeText(PuRecycleViewActivity.this,pos,Toast.LENGTH_SHORT).show();
								}
							}));
	}
	
}

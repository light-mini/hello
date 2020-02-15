package com.mycompany.myapp2.recycleactivity;
import android.app.*;
import android.os.*;
import com.mycompany.myapp2.*;
import android.support.v7.widget.*;
import android.graphics.*;
import android.widget.*;

public class LinearViewActivity extends Activity
{
	private RecyclerView mrv1;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recycle_linear_view);

		mrv1 = findViewById(R.id.linear_main);
		mrv1.setLayoutManager(new LinearLayoutManager(LinearViewActivity.this));
		mrv1.addItemDecoration(new MyDecoration());
		mrv1.setAdapter(new LinearViewAdapter(LinearViewActivity.this, new LinearViewAdapter.OnItemClickListener(){

								@Override
								public void OnClick(int pos)
								{
									// TODO: Implement this method
									Toast.makeText(LinearViewActivity.this,""+pos,Toast.LENGTH_SHORT).show();
								}
							}));

	}
	class MyDecoration extends RecyclerView.ItemDecoration
	{

		@Override
		public void getItemOffsets(Rect outRect, int itemPosition, RecyclerView parent)
		{
			// TODO: Implement this method
			super.getItemOffsets(outRect, itemPosition, parent);
			outRect.set(0, 0, 0, getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
		}

	}

}

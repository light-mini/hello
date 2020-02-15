package com.mycompany.myapp2.recycleactivity;
import android.content.*;
import android.support.v7.widget.*;
import android.view.*;
import com.mycompany.myapp2.*;
import android.widget.*;
import android.view.View.*;
import android.widget.AdapterView.*;

public class LinearViewAdapter extends RecyclerView.Adapter<LinearViewAdapter.LinearViewHolder>
{
	private Context mcontext;
	private OnItemClickListener mListener;
	
	public LinearViewAdapter(Context context,OnItemClickListener  listener){
		this.mcontext = context;
		this.mListener = listener;
	}

	@Override
	public LinearViewAdapter.LinearViewHolder onCreateViewHolder(ViewGroup p1, int p2)
	{
		// TODO: Implement this method
		return new LinearViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.laout_linear_item,p1,false));
	}

	@Override
	public void onBindViewHolder(LinearViewAdapter.LinearViewHolder p1, final int p2)
	{
		// TODO: Implement this method
		p1.textview.setText("hello world");
		p1.textview.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					//Toast.makeText(mcontext,p2,Toast.LENGTH_SHORT).show();
					mListener.OnClick(p2);
				}
			});
	}

	@Override
	public int getItemCount()
	{
		// TODO: Implement this method
		return 30;
	}
	
	class LinearViewHolder extends RecyclerView.ViewHolder
	{
		private TextView textview;
		
		public LinearViewHolder(View itemview){
			super(itemview);
			
			textview = itemview.findViewById(R.id.title_laout_linear_item);
		}
		
	}
	public interface OnItemClickListener
	{
		void OnClick(int pos);
	}
}

package com.mycompany.myapp2.recycleactivity;
import android.content.*;
import android.support.v7.widget.*;
import android.view.*;
import com.mycompany.myapp2.*;
import android.widget.*;
import android.view.View.*;
import android.widget.AdapterView.*;

public class PuAdapter extends RecyclerView.Adapter<PuAdapter.PuViewHolder>
{
	private Context mcontext;
	private OnItemClickListener mListener;

	public PuAdapter(Context context,OnItemClickListener  listener){
		this.mcontext = context;
		this.mListener = listener;
	}

	@Override
	public PuAdapter.PuViewHolder onCreateViewHolder(ViewGroup p1, int p2)
	{
		// TODO: Implement this method
		return new PuViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.layout_pu_item,p1,false));
	}

	@Override
	public void onBindViewHolder(PuAdapter.PuViewHolder p1, final int p2)
	{
		// TODO: Implement this method
		if(p2%2==0){
			p1.imageview.setImageResource(R.drawable.micro);
		}else{
			p1.imageview.setImageResource(R.drawable.mmexport);
		}
		p1.imageview.setOnClickListener(new ImageView.OnClickListener(){

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
		return 50;
	}

	class PuViewHolder extends RecyclerView.ViewHolder
	{
		private ImageView imageview;

		public PuViewHolder(View itemview){
			super(itemview);

			imageview = itemview.findViewById(R.id.iv);
		}

	}
	public interface OnItemClickListener
	{
		void OnClick(int pos);
	}
}

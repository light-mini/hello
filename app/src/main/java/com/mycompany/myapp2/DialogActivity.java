package com.mycompany.myapp2;
import android.app.*;
import android.os.*;
import android.widget.*;
//import android.view.View.*;
import android.view.*;
import android.support.v7.app.AlertDialog.*;
import android.content.*;
import android.view.View.*;

public class DialogActivity extends Activity
{
	private Button btn1,btn2,btn3,btn4,btn5;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dialog_view);
		
		btn1 = findViewById(R.id.btn_dialog1);
		btn2 = findViewById(R.id.btn_dialog2);
		btn3 = findViewById(R.id.btn_dialog3);
		btn4 = findViewById(R.id.btn_dialog4);
		btn5 = findViewById(R.id.btn_dialog5);
		
		OnClick onclick = new OnClick();
		btn1.setOnClickListener(onclick);
		btn2.setOnClickListener(onclick);
		btn3.setOnClickListener(onclick);
		btn4.setOnClickListener(onclick);
		btn5.setOnClickListener(onclick);
		
	}
	class OnClick implements View.OnClickListener
	{

		@Override
		public void onClick(View p1)
		{
			// TODO: Implement this method
			switch(p1.getId()){
				case R.id.btn_dialog1:
					AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
					/* 
					builder.setTitle("请回答");
					builder.setMessage("课程如何");*/
					builder.setTitle("请回答").setMessage("课程如何")
					.setIcon(R.drawable.login)
					.setPositiveButton("棒", new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{
								// TODO: Implement this method
								Toast.makeText(getApplicationContext(),"你诚实",Toast.LENGTH_SHORT).show();
							}
						}).setNeutralButton("还行", new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{
								// TODO: Implement this method
								Toast.makeText(getApplicationContext(),"你再看看",Toast.LENGTH_SHORT).show();
							}
						}).setNegativeButton("差", new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{
								// TODO: Implement this method
								Toast.makeText(getApplicationContext(),"你傻子",Toast.LENGTH_SHORT).show();
							}
						}).show();
					break;
				case R.id.btn_dialog2:
					final String[] array2 = new String[]{"男","女","妖"};
					AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogActivity.this);
					builder2.setTitle("性别")
						.setItems(array2, new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{
								// TODO: Implement this method
								Toast.makeText(DialogActivity.this,array2[p2],Toast.LENGTH_SHORT).show();
							}
						})
					.show();
					break;
				case R.id.btn_dialog3:
					final String[] array3 = new String[]{"男","女","妖"};
					AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogActivity.this);
					builder3.setSingleChoiceItems(array3,0,new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2)
							{
								// TODO: Implement this method
								Toast.makeText(DialogActivity.this,array3[p2],Toast.LENGTH_SHORT).show();
								p1.dismiss();
							}
						}).setCancelable(false).show();
					break;
				case R.id.btn_dialog4:
					final String[] array4 = new String[]{"唱歌","跳舞","血袋吗"};
					boolean[] isselected = new boolean[]{false,false,true};
					AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogActivity.this);
					builder4.setTitle("兴趣爱好")
						.setMultiChoiceItems(array4, isselected, new DialogInterface.OnMultiChoiceClickListener(){

							@Override
							public void onClick(DialogInterface p1, int p2, boolean p3)
							{
								// TODO: Implement this method
								Toast.makeText(DialogActivity.this,array4[p2]+"__"+p3,Toast.LENGTH_SHORT).show();
							}
						})
					.show();
					break;
				case R.id.btn_dialog5:
					AlertDialog.Builder builder5 = new AlertDialog.Builder(DialogActivity.this);
					View view = LayoutInflater.from(DialogActivity.this).inflate(R.layout.layout_dialog,null);
					final EditText uname = view.findViewById(R.id.layout_dialog_username);
					final EditText password = view.findViewById(R.id.layout_dialog_password);
					Button login = view.findViewById(R.id.layout_dialog_login);
					login.setOnClickListener(new View.OnClickListener(){

							@Override
							public void onClick(View p1)
							{
								// TODO: Implement this method
								Toast.makeText(DialogActivity.this,uname.getText()+""+password.getText(),Toast.LENGTH_SHORT).show();
							}
						});
					builder5.setTitle("请先登录").setView(view).show();
					break;
			}
		}
	}
	
}

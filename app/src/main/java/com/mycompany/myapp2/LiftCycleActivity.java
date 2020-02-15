package com.mycompany.myapp2;
import android.os.*;
import android.util.*;
import android.app.*;

public class LiftCycleActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liftcycle);
		Log.d("LiftCycle","---onCreate---");
	}

	@Override
	protected void onStart()
	{
		// TODO: Implement this method
		super.onStart();
		Log.d("LiftCycle","---onStart---");
	}

	@Override
	protected void onResume()
	{
		// TODO: Implement this method
		super.onResume();
		Log.d("LiftCycle","---onResume---");
	}

	@Override
	protected void onPause()
	{
		// TODO: Implement this method
		super.onPause();
		Log.d("LiftCycle","---onPause---");
	}

	@Override
	protected void onStop()
	{
		// TODO: Implement this method
		super.onStop();
		Log.d("LiftCycle","---onStop---");
	}

	@Override
	protected void onRestart()
	{
		// TODO: Implement this method
		super.onRestart();
		Log.d("LiftCycle","---onRestart---");
	}

	@Override
	protected void onDestroy()
	{
		// TODO: Implement this method
		super.onDestroy();
		Log.d("LiftCycle","---onDestroy---");
	}
	
	
}

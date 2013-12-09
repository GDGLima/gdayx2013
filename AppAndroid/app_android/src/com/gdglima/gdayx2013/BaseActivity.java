package com.gdglima.gdayx2013;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class BaseActivity extends Activity {

	public BaseActivity() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		app();
	}
	protected void app()
	{}
	protected void dispose()
	{}
	
	protected void next(Class<?> activity)
	{
		startActivity(new Intent(this, activity));
		finish();
	}
	protected void nextData(Class<?> activity,int position)
	{
		Intent intent=new Intent(this, activity);
		intent.putExtra("position", position);
		startActivity(intent);
		
		finish();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		//super.onBackPressed();
	}

}

package com.gdglima.gdayx2013;

import java.util.Timer;
import java.util.TimerTask;

import com.gdglima.gdayx2013.utils.DevFestLimaSession;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class SplashActivity extends BaseActivity {

	private long splashDelay = 2000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_splash);
		super.onCreate(savedInstanceState);
	
	}
	
	@Override
	protected void app() {
		// TODO Auto-generated method stub
		super.app();
		DevFestLimaSession.getInstance();
		DevFestLimaSession.getInstance().loadData(getResources().getStringArray(R.array.arr_agenda_business), 
				getResources().getStringArray(R.array.arr_agenda_devs), 
				getResources().getStringArray(R.array.arr_speakers),
				getResources().getStringArray(R.array.arr_sponsors)); 
		
		Log.v("CONSOLE", ""+getResources().getStringArray(R.array.arr_agenda_business).toString());
		
	    TimerTask task = new TimerTask() 
	    {
	        @Override
	        public void run() {
	        	next(GDayx2013Activity.class);
	        }
	      };

	      Timer timer = new Timer();
	      timer.schedule(task, splashDelay);
	}



}

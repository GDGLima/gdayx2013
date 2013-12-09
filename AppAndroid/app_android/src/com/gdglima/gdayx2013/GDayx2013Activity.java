package com.gdglima.gdayx2013;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.gdglima.gdayx2013.agenda.AgendaFragment;
import com.gdglima.gdayx2013.controller.MyTabListener;
import com.gdglima.gdayx2013.place.PlaceFragment;
import com.gdglima.gdayx2013.speakers.SpeakerFragment;
import com.gdglima.gdayx2013.sponsor.SponsorFragment;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class GDayx2013Activity extends SherlockFragmentActivity  {

	Tab agendaTap,speakersTab,sponsorTab,placeTab;
	Fragment agenda,speakers,sponsor,place;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gdayx2013);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionBar.setDisplayShowTitleEnabled(true);
		
		agenda=new AgendaFragment();
		speakers=new SpeakerFragment();
		sponsor=new SponsorFragment();
		place=new PlaceFragment();
		
		//----------------------------------
		agendaTap=actionBar.newTab();
		agendaTap.setText("Agenda");
		agendaTap.setTabListener(new MyTabListener(agenda));
		
		speakersTab=actionBar.newTab();
		speakersTab.setText("Speakers");
		speakersTab.setTabListener(new MyTabListener(speakers));
		
		sponsorTab=actionBar.newTab();
		sponsorTab.setText("Sponsor");
		sponsorTab.setTabListener(new MyTabListener(sponsor));
		
		placeTab=actionBar.newTab();
		placeTab.setText("Lugar");
		placeTab.setTabListener(new MyTabListener(place));
		
		actionBar.addTab(agendaTap);
		actionBar.addTab(speakersTab);
		actionBar.addTab(sponsorTab);
		actionBar.addTab(placeTab);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getSupportMenuInflater().inflate(R.menu.gdayx2013, menu);
		return true;
	}
	
	/**
	 * Gplus http://ankitthakkar90.blogspot.com/2013/05/google-plus-integration-in-android.html
	 */



}

/**
 * 
 */
package com.gdglima.gdayx2013.place;

import com.gdglima.gdayx2013.R;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author emedinaa
 *
 */
public class PlaceFragment extends Fragment {
	private MapView mapView;
	private GoogleMap map;
	//-12.097732703403762, -76.95024665000005
	private static final LatLng USMP_LOCATION =new LatLng(-12.097732703403762, -76.95024665000005);
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
        View rootView = inflater.inflate(R.layout.fragment_place, container, false);
        
      //  map=((SupportMapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
        mapView=(MapView)rootView.findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);
        mapView.onResume();
        

        try {
				MapsInitializer.initialize(getActivity());
				map=mapView.getMap();
				//setup();
			} catch (GooglePlayServicesNotAvailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
        return rootView;
	}
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if(map!=null)
		{
			setup();
		}
	}

	private void setup() {
		// TODO Auto-generated method stub
		 map.setMyLocationEnabled(true);
	        
	        CameraPosition cameraPosition = new CameraPosition.Builder()
	        .target(USMP_LOCATION) // Sets the center of the map to
	                                    // Golden Gate Bridge
	        .zoom(16)                   // Sets the zoom
	        .bearing(90) // Sets the orientation of the camera to east
	        .tilt(60)    // Sets the tilt of the camera to 30 degrees
	        .build();    // Creates a CameraPosition from the builder
	        
	        CameraUpdate cameraUpdate=CameraUpdateFactory.newCameraPosition(
	    	        cameraPosition);
		    map.animateCamera(cameraUpdate);
		    
	        map.addMarker(new MarkerOptions()
	        .position(USMP_LOCATION)
	        .title("DevFest 2013 Season 2"));
	}
}

/**
 * 
 */
package com.gdglima.gdayx2013.place;

import com.gdglima.gdayx2013.R;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.SupportMapFragment;

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
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
        View rootView = inflater.inflate(R.layout.fragment_place, container, false);
        
      //  map=((SupportMapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
        mapView=(MapView)rootView.findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);
        mapView.onResume();
        
        if(map!=null)
        {
        	try {
				MapsInitializer.initialize(getActivity());
			} catch (GooglePlayServicesNotAvailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
        map=mapView.getMap();
        
        return rootView;
	}
}

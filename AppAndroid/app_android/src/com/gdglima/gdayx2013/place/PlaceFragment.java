/**
 * 
 */
package com.gdglima.gdayx2013.place;

import com.gdglima.gdayx2013.R;

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

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
        View rootView = inflater.inflate(R.layout.fragment_place, container, false);
        return rootView;
	}
}

/**
 * 
 */
package com.gdglima.gdayx2013.sponsor;

import com.gdglima.gdayx2013.R;
import com.gdglima.gdayx2013.speakers.SpeakerAdapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * @author emedinaa
 *
 */
public class SponsorFragment extends Fragment {

	private GridView grid;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
        View rootView = inflater.inflate(R.layout.fragment_sponsor, container, false);
        
        grid=(GridView)rootView.findViewById(R.id.gridSponsor);
        SponsorAdapter adapter=new  SponsorAdapter(getActivity().getApplicationContext());
        grid.setAdapter(adapter);
        
        return rootView;
	}
}

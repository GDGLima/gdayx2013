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
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.GridView;

/**
 * @author emedinaa
 *
 */
public class SponsorFragment extends Fragment {

	private GridView grid;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
        View rootView = inflater.inflate(R.layout.fragment_sponsor, container, false);
     
        grid=(GridView)rootView.findViewById(R.id.gridSponsor);
        SponsorAdapter adapter=new  SponsorAdapter(getActivity().getApplicationContext());
        grid.setAdapter(adapter);
        
        AnimationSet set=new AnimationSet(true);
        
        Animation animation=new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(150);
        set.addAnimation(animation);
        
        Animation animation2=AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.scale_in);
        set.addAnimation(animation2);
        
        LayoutAnimationController controller=new LayoutAnimationController(set,0.5f);
        
        grid.setLayoutAnimation(controller);
        return rootView;
	}
}

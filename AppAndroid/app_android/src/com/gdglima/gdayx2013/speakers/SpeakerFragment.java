package com.gdglima.gdayx2013.speakers;

import com.gdglima.gdayx2013.R;
import com.gdglima.gdayx2013.utils.ImageUtils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

public class SpeakerFragment extends Fragment {

	private ImageView img;
	private GridView grid;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
        View rootView = inflater.inflate(R.layout.fragment_speakers, container, false);
        
        grid=(GridView)rootView.findViewById(R.id.gridSpeaker);
        SpeakerAdapter adapter=new  SpeakerAdapter(getActivity().getApplicationContext());
        grid.setAdapter(adapter);
        /*img=(ImageView)rootView.findViewById(R.id.img);
        
        Bitmap bm=BitmapFactory.decodeResource(getResources(), R.drawable.pic_eduardo);
        Bitmap aux=ImageUtils.getCircularBitmap(bm);
        if(aux!=null)
        {
        	img.setImageBitmap(aux);
        }*/
        return rootView;
	}
}

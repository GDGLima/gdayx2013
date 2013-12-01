package com.gdglima.gdayx2013.sponsor;

import java.util.Arrays;
import java.util.List;

import com.gdglima.gdayx2013.R;
import com.gdglima.gdayx2013.utils.ImageUtils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class SponsorAdapter extends BaseAdapter {

	private Context mContext;
	public List<SponsorVo> arrSponsors;
	
    public SponsorAdapter(Context c) {
        mContext = c;
        arrSponsors=Arrays.asList(mSponsors);
    }
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mSponsors.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) 
	{
		// TODO Auto-generated method stub
		SpeakerViewHolder holder;
		if(view==null)
		{
			LayoutInflater l=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view=l.inflate(R.layout.item_sponsor, parent,false);
			holder= new SpeakerViewHolder();
			holder.txtSpeaker=(TextView)view.findViewById(R.id.txtSpeaker);
			holder.txtDetailsSpeaker=(TextView)view.findViewById(R.id.txtDetailsSpeaker);
			holder.img=(ImageView)view.findViewById(R.id.imgSpeaker);
			holder.bgImg=(View)view.findViewById(R.id.viewSpeaker);
			//view.setLayoutParams(new GridView.LayoutParams(140,280));
			
		}else
		{
			holder=(SpeakerViewHolder)view.getTag();
		}
		
		SponsorVo speaker =arrSponsors.get(position);
		if(speaker!=null)
		{
			holder.txtSpeaker.setText(speaker.getName());
			holder.txtDetailsSpeaker.setText(speaker.getDetails());
			
	        Bitmap bm=BitmapFactory.decodeResource(mContext.getResources(), speaker.getIdPhoto());
	        Bitmap aux=ImageUtils.getRectangleBitmap(bm);
			holder.img.setImageBitmap(aux);
			
			view.setTag(holder);
		}
		
		return view;
	}

	static class SpeakerViewHolder
	{
		ImageView img;
		View bgImg;
		TextView txtSpeaker;
		TextView txtDetailsSpeaker;
	}
	//Data ----------------------
	private SponsorVo[] mSponsors={
		new SponsorVo(R.drawable.gdg, "Google Developers", "Organizer GDG Lima"),
		new SponsorVo(R.drawable.gbg, "GBG", "Organizer GDG Lima"),
		new SponsorVo(R.drawable.usmp, "San Martin", "Organizer GDG Lima"),
		new SponsorVo(R.drawable.google_logo, "Google", "Organizer GDG Lima"),
		new SponsorVo(R.drawable.sponsor_gbg, "GBG Lima", "Organizer GDG Lima"),
		new SponsorVo(R.drawable.sponsor_gdglima, "GDG Lima", "Organizer GDG Lima"),
		new SponsorVo(R.drawable.sponsor_gdglima, "GDG Lima", "Organizer GDG Lima")
	};


}

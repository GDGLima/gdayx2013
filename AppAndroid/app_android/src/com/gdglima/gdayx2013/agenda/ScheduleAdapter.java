package com.gdglima.gdayx2013.agenda;

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

public class ScheduleAdapter extends BaseAdapter {

	private Context mContext;
	public List<ScheduleVo> arrSchedule;
	
    public ScheduleAdapter(Context c) {
        mContext = c;
        arrSchedule=Arrays.asList(mSchedule);
    }
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mSchedule.length;
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
		ScheduleViewHolder holder;
		if(view==null)
		{
			LayoutInflater l=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view=l.inflate(R.layout.item_speaker, parent,false);
			holder= new ScheduleViewHolder();
			holder.txtSpeaker=(TextView)view.findViewById(R.id.txtSpeaker);
			holder.txtDetailsSpeaker=(TextView)view.findViewById(R.id.txtDetailsSpeaker);
			holder.img=(ImageView)view.findViewById(R.id.imgSpeaker);
			holder.bgImg=(View)view.findViewById(R.id.viewSpeaker);
			//view.setLayoutParams(new GridView.LayoutParams(140,280));
			
		}else
		{
			holder=(ScheduleViewHolder)view.getTag();
		}
		
		ScheduleVo schedule =arrSchedule.get(position);
		if(schedule!=null)
		{
			/*holder.txtSpeaker.setText(speaker.getName());
			holder.txtDetailsSpeaker.setText(speaker.getDetails());
			
	        Bitmap bm=BitmapFactory.decodeResource(mContext.getResources(), speaker.getIdPhoto());
	        Bitmap aux=ImageUtils.getCircularBitmap(bm);
			holder.img.setImageBitmap(aux);
			
			view.setTag(holder); */
		}
		
		return view;
	}

	static class ScheduleViewHolder
	{
		ImageView img;
		View bgImg;
		TextView txtSpeaker;
		TextView txtDetailsSpeaker;
	}
	//Data ----------------------
	private ScheduleVo[] mSchedule={
		new ScheduleVo(),
		new ScheduleVo(),
		new ScheduleVo(),
		new ScheduleVo(),
		new ScheduleVo(),
		new ScheduleVo(),
		new ScheduleVo()
	};


}

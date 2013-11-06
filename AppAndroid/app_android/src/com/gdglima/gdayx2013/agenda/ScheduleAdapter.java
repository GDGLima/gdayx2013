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

		ScheduleViewHolder holder;
		if(view==null)
		{
			LayoutInflater l=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view=l.inflate(R.layout.item_schedule, parent,false);
			
			holder= new ScheduleViewHolder();
			holder.txtHour1=(TextView)view.findViewById(R.id.txthour1);
			holder.txtHour2=(TextView)view.findViewById(R.id.txthour2);
			
			holder.txt1=(TextView)view.findViewById(R.id.txt1);
			holder.txt2=(TextView)view.findViewById(R.id.txt2);
			holder.txt3=(TextView)view.findViewById(R.id.txt3);
			//view.setLayoutParams(new GridView.LayoutParams(140,280));
			
		}else
		{
			holder=(ScheduleViewHolder)view.getTag();
		}
		
		ScheduleVo schedule =arrSchedule.get(position);
		if(schedule!=null)
		{
			holder.txtHour1.setText(schedule.getHour1());
			holder.txtHour2.setText(schedule.getHour2());
			
			holder.txt1.setText(schedule.getTxt1());
			holder.txt2.setText(schedule.getTxt2());
			holder.txt3.setText(schedule.getTxt3());
					
			view.setTag(holder);
		}
		
		return view;
	}

	static class ScheduleViewHolder
	{
		TextView txtHour1;
		TextView txtHour2;
		
		TextView txt1;
		TextView txt2;
		TextView txt3;
	}
	//Data ----------------------
	private ScheduleVo[] mSchedule={
		new ScheduleVo("08:30","09:30","Android Design","",""),
		new ScheduleVo("09:30","10:30","","Android Beginners",""),
		new ScheduleVo("10:30","11:30","","",""),
		new ScheduleVo("11:30","12:30","","",""),
		new ScheduleVo("12:30","01:30","","Google Glass",""),
		new ScheduleVo("12:30","01:30","","",""),
		new ScheduleVo("12:30","01:30","","",""),
		new ScheduleVo("12:30","01:30","","",""),
		new ScheduleVo("12:30","01:30","","","Android Patterns"),
		new ScheduleVo("12:30","01:30","","",""),
		new ScheduleVo("12:30","01:30","Android Animations","","")

	};


}

package com.gdglima.gdayx2013.agenda;

import java.util.Arrays;
import java.util.List;

import com.gdglima.gdayx2013.R;
import com.gdglima.gdayx2013.utils.ImageUtils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Log;
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
    
    public ScheduleAdapter(Context c , ScheduleVo[] data) {
        mContext = c;
        arrSchedule=Arrays.asList(data);
    }
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrSchedule.size();
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
			holder.view=view;
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
			//new ScheduleVo(hour1, hour2, txt1, txt2, txt3)
			//new ScheduleVo(data[0], "", data[1], "", "");
			Log.v("CONSOLE",schedule.getHour1()+ " "+
					schedule.getHour2() +" "+
					schedule.getTxt1()+" "+
					schedule.getTxt2()+" "+
					schedule.getTxt3()
			);
			String title =schedule.getHour1();
			if(title.equals("---"))
			{
				holder.txt1.setTextColor(mContext.getResources().getColor(R.color.color_blue));
				holder.txt1.setTypeface(null, Typeface.BOLD);
				holder.txtHour1.setTypeface(null, Typeface.BOLD);
				
				holder.txtHour1.setText(schedule.getHour2());
				holder.view.setBackgroundColor(mContext.getResources().getColor(R.color.color_blue));
			}else
			{
				holder.txtHour1.setText(schedule.getHour1());
				holder.txt1.setTypeface(null, Typeface.NORMAL);
				holder.txtHour1.setTypeface(null, Typeface.NORMAL);
				
				holder.txt1.setTextColor(mContext.getResources().getColor(R.color.color_b1));
				holder.view.setBackgroundColor(mContext.getResources().getColor(R.color.color_w1));
			}
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
		View view;
		TextView txtHour1;
		TextView txtHour2;
		
		TextView txt1;
		TextView txt2;
		TextView txt3;
	}
	//Data ----------------------
	private ScheduleVo[] mSchedule=
		{
			new ScheduleVo("","","Dia 1: Google for Business","",""),
			new ScheduleVo("8:00 am","9:30 am","Registro de asistentes.","",""),
			new ScheduleVo("9:30 am","","Conferencias y seminarios.","",""),
			new ScheduleVo("12:30 pm","","Almuerzo.","",""),
			new ScheduleVo("2:00 pm","6:00 pm","Conferencias y seminarios.","",""),
			new ScheduleVo("6:00 pm","","Cierre d’a 1.","",""),
			new ScheduleVo("","","-----------","---------","---------"),
			new ScheduleVo("","","Dia 2: DevFest Lima","",""),
			new ScheduleVo("","","-----------","---------","---------"),
			new ScheduleVo("8:00 am","9:30 am","Registro de asistentes.","",""),
			new ScheduleVo("9:30 am","","Conferencias y seminarios.","",""),
			new ScheduleVo("12:30 pm","","Almuerzo.","",""),
			new ScheduleVo("2:00 pm","4:30 pm","Conferencias y seminarios.","",""),
			new ScheduleVo("4:30 pm","","Sorteos, sorpresas, cierre, After Party.","","")

	};


}

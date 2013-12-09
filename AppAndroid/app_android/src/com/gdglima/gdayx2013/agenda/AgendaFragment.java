package com.gdglima.gdayx2013.agenda;

import com.gdglima.gdayx2013.R;
import com.gdglima.gdayx2013.speakers.SpeakerAdapter;
import com.gdglima.gdayx2013.utils.DevFestLimaSession;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

public class AgendaFragment extends Fragment {

	private ListView lstSchedule;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
        //View rootView = inflater.inflate(R.layout.fragment_agenda, container, false);
        
        View rootView = inflater.inflate(R.layout.fragment_agenda, container, false);
        
        lstSchedule=(ListView)rootView.findViewById(R.id.lstSchedule);
       // ScheduleAdapter adapter=new  ScheduleAdapter(getActivity().getApplicationContext());
        ScheduleAdapter adapter=new  ScheduleAdapter(getActivity().getApplicationContext(),
        		DevFestLimaSession.getInstance().getArrBusiness());
        lstSchedule.setAdapter(adapter);
        
        return rootView;
	}
}

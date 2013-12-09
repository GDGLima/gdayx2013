package com.gdglima.gdayx2013.utils;

import android.util.Log;

import com.gdglima.gdayx2013.R;
import com.gdglima.gdayx2013.agenda.ScheduleVo;
import com.gdglima.gdayx2013.speakers.SpeakerVo;
import com.gdglima.gdayx2013.sponsor.SponsorVo;

public class DevFestLimaSession {
	
	private static DevFestLimaSession INSTANCE = null;
	private ScheduleVo[] arrBusiness;
	private ScheduleVo[] arrDev;
	private SpeakerVo[] arrSpeakers;
	private SponsorVo[] arrSponsors;
	
	public SponsorVo[] getArrSponsors() {
		return arrSponsors;
	}
	public SpeakerVo[] getArrSpeakers() {
		return arrSpeakers;
	}
	public ScheduleVo[] getArrDev() {
		return arrDev;
	}
	public ScheduleVo[] getArrBusiness() {
		return arrBusiness;
	}

	private Integer[] photoSpeakers={R.drawable.david,
			R.drawable.deborah,R.drawable.freddy,R.drawable.maximiliano,
			R.drawable.talia,R.drawable.nick,R.drawable.marco,R.drawable.matias};
	
	private Integer[] photoSponsors={R.drawable.google_logo,R.drawable.usmp_logo,
			R.drawable.gbglogo, R.drawable.googledev_logo,
			R.drawable.upacifico_logo,R.drawable.pucp_logo,R.drawable.gbglima_logo,
			R.drawable.gdglogo,R.drawable.pucp_logo,R.drawable.upacifico_logo};
	


	private DevFestLimaSession(){}
	
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new DevFestLimaSession();
        }
    }
 
    public static DevFestLimaSession getInstance() {
        createInstance();
        return INSTANCE;
    }
    
    public void loadData(String[] _business,String[] _dev, String[] _speakers,String[] _sponsors)
    {
    	arrBusiness=new ScheduleVo[_business.length];
    	arrDev=new ScheduleVo[_dev.length];
    	arrSpeakers=new SpeakerVo[_speakers.length];
    	arrSponsors=new SponsorVo[_sponsors.length];
    	
    	for (int i = 0; i < _business.length; i++) {
			arrBusiness[i]=readScheduleString(_business[i]);
		}
    	/*for (int j = 0; j < _dev.length; j++) {
			arrDev[j]=readScheduleString(_dev[j]);
		}*/
    	
    	for (int k = 0; k < _speakers.length; k++) {
    		arrSpeakers[k]=readSpeakerString(k,_speakers[k]);
		}
    	
    	for (int l = 0; l < _sponsors.length; l++) {
    		arrSponsors[l]=readSponsorString(l,_sponsors[l]);
		}
    }
    
    public ScheduleVo readScheduleString(String s)
    {
    
    	String[] data=s.split("\\|");
    	for (int i = 0; i < data.length; i++) {
			Log.v("CONSOLE",">>> "+ data[i]);
		}
    	ScheduleVo vo=new ScheduleVo(data[0], data[1], data[2], "", "");
    	return vo;
    }
    
    public SpeakerVo readSpeakerString(int _pos, String s)
    {
    	String[] data=s.split("\\|");
    	int pos=(_pos<photoSpeakers.length)?(photoSpeakers[_pos]):(0);
    	
    	SpeakerVo vo=new SpeakerVo(pos,data[0],data[1]);
    	return vo;
    }
    
    public SponsorVo readSponsorString(int _pos, String s)
    {
    	String[] data=s.split("\\|");
    	int pos=(_pos<photoSponsors.length)?(photoSponsors[_pos]):(0);
    	
    	SponsorVo vo=new SponsorVo(pos,data[0],data[1]);
    	return vo;
    }

}

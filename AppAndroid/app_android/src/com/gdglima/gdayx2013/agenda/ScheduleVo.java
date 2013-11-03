package com.gdglima.gdayx2013.agenda;

import java.io.Serializable;

public class ScheduleVo implements Serializable 
{
	private String hour1="08:00";
	private String hour2="09:00";
	
	private String txt1="Android Design";
	private String txt2="Introduction Android";
	private String txt3="Android Studio";
	
	
	public ScheduleVo(String hour1, String hour2, String txt1, String txt2,
			String txt3) {
		super();
		this.hour1 = hour1;
		this.hour2 = hour2;
		this.txt1 = txt1;
		this.txt2 = txt2;
		this.txt3 = txt3;
	}

	public ScheduleVo(String hour1, String hour2) {
		super();
		this.hour1 = hour1;
		this.hour2 = hour2;
	}
	
	public ScheduleVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHour1() {
		return hour1;
	}
	public void setHour1(String hour1) {
		this.hour1 = hour1;
	}
	public String getHour2() {
		return hour2;
	}
	public void setHour2(String hour2) {
		this.hour2 = hour2;
	}

	public String getTxt1() {
		return txt1;
	}

	public void setTxt1(String txt1) {
		this.txt1 = txt1;
	}

	public String getTxt2() {
		return txt2;
	}

	public void setTxt2(String txt2) {
		this.txt2 = txt2;
	}

	public String getTxt3() {
		return txt3;
	}

	public void setTxt3(String txt3) {
		this.txt3 = txt3;
	}
	

}

package com.gdglima.gdayx2013.sponsor;

import java.io.Serializable;

public class SponsorVo implements Serializable {
	
	private int id;
	private int idPhoto;
	private String name, details;
	
	
	public SponsorVo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SponsorVo(int idPhoto, String name, String details) {
		super();
		this.idPhoto = idPhoto;
		this.name = name;
		this.details = details;
	}


	public int getId() {
		return id;
	}


	public int getIdPhoto() {
		return idPhoto;
	}


	public String getName() {
		return name;
	}


	public String getDetails() {
		return details;
	}
	
	
	

}

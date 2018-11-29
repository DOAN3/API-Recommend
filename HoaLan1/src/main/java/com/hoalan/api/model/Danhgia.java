package com.hoalan.api.model;


import java.io.Serializable;
  
public class Danhgia implements Serializable {
  
	private static final long serialVersionUID = -8040774021158552554L;
	
	private int id;
	private String Noidung;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoidung() {
		return Noidung;
	}
	public void setNoidung(String noidung) {
		Noidung = noidung;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
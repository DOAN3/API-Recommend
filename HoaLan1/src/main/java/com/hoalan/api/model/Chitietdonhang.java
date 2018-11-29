package com.hoalan.api.model;


import java.io.Serializable;

import java.sql.Date;
  
public class Chitietdonhang implements Serializable {
  
	private static final long serialVersionUID = -8040774021158552554L;
	
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSoluong() {
		return Soluong;
	}
	public void setSoluong(int soluong) {
		Soluong = soluong;
	}
	public String getDonvitinh() {
		return Donvitinh;
	}
	public void setDonvitinh(String donvitinh) {
		Donvitinh = donvitinh;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int Soluong;
	private String Donvitinh;
		
		
	}


	
		


    
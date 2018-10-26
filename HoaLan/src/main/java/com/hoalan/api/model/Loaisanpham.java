package com.hoalan.api.model;


import java.io.Serializable;
  
public class Loaisanpham implements Serializable {
  
	private static final long serialVersionUID = -8040774021158552554L;
	private int id;
	private String ten;
	private String mota;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
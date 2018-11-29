package com.hoalan.api.model;


import java.io.Serializable;
  
public class Thanhtoan implements Serializable {
  
	private static final long serialVersionUID = -8040774021158552554L;
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHinhthuc() {
		return hinhthuc;
	}
	public void setHinhthuc(String hinhthuc) {
		this.hinhthuc = hinhthuc;
	}
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String hinhthuc;
	private String ghichu;
	 
}
	
  
package com.hoalan.api.model;


import java.io.Serializable;
  
public class Nhacnho implements Serializable {
  
	private static final long serialVersionUID = -8040774021158552554L;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getThongtinkhachhang() {
		return thongtinkhachhang;
	}
	public void setThongtinkhachhang(String thongtinkhachhang) {
		this.thongtinkhachhang = thongtinkhachhang;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int id;
	private String thongtinkhachhang;
}
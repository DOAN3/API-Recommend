package com.hoalan.api.model;


import java.io.Serializable;

import java.sql.Date;
  
public class Donhang implements Serializable {
  
	private static final long serialVersionUID = -8040774021158552554L;
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaso() {
		return maso;
	}

	public Date getThoigian() {
		return thoigian;
	}
	public void setThoigian(Date thoigian) {
		this.thoigian = thoigian;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public int getTongtien() {
		return tongtien;
	}
	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int maso;
	private Date thoigian;
	private String diachi;
    private String tenhang;
    private int tongtien;
    private int soluong;
	public void setMaso(int maso) {
		this.maso = maso;
		
		
	}



		
	}
	
		


    
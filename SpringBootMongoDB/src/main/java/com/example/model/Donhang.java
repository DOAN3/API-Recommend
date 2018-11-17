package com.example.model;











import java.util.Date;

import org.springframework.data.annotation.Id;

public class Donhang {
    @Id 
    private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMaso() {
		return maso;
	}
	public void setMaso(int maso) {
		this.maso = maso;
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
	public String getTongtien() {
		return tongtien;
	}
	public void setTongtien(String tongtien) {
		this.tongtien = tongtien;
	}
	private int maso;
	private Date thoigian;
    private String diachi;
    private String tenhang;
    private String tongtien;


    }


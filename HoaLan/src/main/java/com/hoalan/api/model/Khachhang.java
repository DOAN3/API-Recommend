package com.hoalan.api.model;


import java.io.Serializable;
  
public class Khachhang implements Serializable {
  
	private static final long serialVersionUID = -8040774021158552554L;
	
	private int id;
	private String ten;
	private String gioitinh;
	private int sodienthoai;
    private String email;
    private String diachi;
    
	
	
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
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public int getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(int sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	
	}
//	public void setSodienthoai(String string) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
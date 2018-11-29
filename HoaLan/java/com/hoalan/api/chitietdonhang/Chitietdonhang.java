package com.hoalan.api.chitietdonhang;


import org.springframework.data.annotation.Id;

public class Chitietdonhang {
	  @Id
	    private String id;
	  public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getDonvitinh() {
		return donvitinh;
	}
	public void setDonvitinh(String donvitinh) {
		this.donvitinh = donvitinh;
	}
	private int soluong;
	    private String donvitinh;
	    

	    
	   

}
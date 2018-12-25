package com.hoalan.api.loaisanpham;


import org.springframework.data.annotation.Id;

public class Loaisanpham {
	  @Id
	    private String id;
		public String getId() {
		return id;
	}
	public void setId(String id) {
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
		private String ten;
		private String mota;
	    

	    
	   

}
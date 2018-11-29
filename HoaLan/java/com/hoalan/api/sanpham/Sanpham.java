package com.hoalan.api.sanpham;


import org.springframework.data.annotation.Id;

public class Sanpham {
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
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	public long getHinh() {
		return hinh;
	}
	public void setHinh(long hinh) {
		this.hinh = hinh;
	}
	public String getGoiy() {
		return goiy;
	}
	public void setGoiy(String goiy) {
		this.goiy = goiy;
	}
		private String ten;
		private String mota;
	    private String gia;
	    private long hinh;
	    private String goiy;
	    

	    
	   

}
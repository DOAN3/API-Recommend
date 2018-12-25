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
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String getHinh() {
		return hinh;
	}
	public void setHinh(String hinh) {
		this.hinh = hinh;
	}
	public String getTheloai() {return theloai;}
	public void setTheLoai(String theloai) {this.theloai = theloai;}
		private String ten;
		private String mota;
	    private int gia;
	    private String hinh;
	    private String theloai;

	    
	    
	    
	    

	    
	   

}
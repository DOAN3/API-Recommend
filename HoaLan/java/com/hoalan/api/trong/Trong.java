package com.hoalan.api.trong;




import java.util.Date;

import org.springframework.data.annotation.Id;

public class Trong {
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
	public String getGiong() {
		return giong;
	}
	public void setGiong(String giong) {
		this.giong = giong;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public Date getNgaytrong() {
		return ngaytrong;
	}
	public void setNgaytrong(Date ngaytrong) {
		this.ngaytrong = ngaytrong;
	}
		private String ten;
		private String giong;
	    private int soluong;
		private Date ngaytrong;
	

	    
	   

}
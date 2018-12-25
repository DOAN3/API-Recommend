package com.hoalan.api.ngaytuoi;




import java.util.Date;

import org.springframework.data.annotation.Id;

public class Ngaytuoi {
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
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
		private String ten;
	    private int soluong;

	

	    
	   

}
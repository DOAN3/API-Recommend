package com.hoalan.api.chitietsanpham;




import java.util.Date;

import org.springframework.data.annotation.Id;

public class Chitietsanpham {
	  @Id
	    private String id;
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSoluong() {
		return soluong;
	}
	public void setSoluong(String soluong) {
		this.soluong = soluong;
	}
	public Date getThoigian() {
		return thoigian;
	}
	public void setThoigian(Date thoigian) {
		this.thoigian = thoigian;
	}
		private String soluong;
		private Date thoigian;
		
	    

	    
	   

}
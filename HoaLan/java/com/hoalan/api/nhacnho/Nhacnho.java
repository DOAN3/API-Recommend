package com.hoalan.api.nhacnho;


import org.springframework.data.annotation.Id;

public class Nhacnho {
	  @Id
	    private String id;
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getThongtinkhachhang() {
		return thongtinkhachhang;
	}
	public void setThongtinkhachhang(String thongtinkhachhang) {
		this.thongtinkhachhang = thongtinkhachhang;
	}
		private String thongtinkhachhang;
	    

	    
	   

}
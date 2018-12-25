package com.hoalan.api.bo;


import org.springframework.data.annotation.Id;

public class Bo {
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
	public String getDacdiem() {
		return dacdiem;
	}
	public void setDacdiem(String dacdiem) {
		this.dacdiem = dacdiem;
	}
		private String ten;
		private String dacdiem;
	    

	    
	   

}
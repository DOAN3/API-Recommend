package com.hoalan.api.goiyphu;


import org.springframework.data.annotation.Id;

public class Goiyphu {
	  @Id
	    private String id;
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSanphamgoiyphu() {
		return sanphamgoiyphu;
	}
	public void setSanphamgoiyphu(String sanphamgoiyphu) {
		this.sanphamgoiyphu = sanphamgoiyphu;
	}
		private String sanphamgoiyphu;
	    

	    
	   

}
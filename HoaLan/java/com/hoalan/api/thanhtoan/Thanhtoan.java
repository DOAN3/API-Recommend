package com.hoalan.api.thanhtoan;


import org.springframework.data.annotation.Id;

public class Thanhtoan {
	  @Id
	    private String id;
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHinhthuc() {
		return hinhthuc;
	}
	public void setHinhthuc(String hinhthuc) {
		this.hinhthuc = hinhthuc;
	}
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
		private String hinhthuc;
	    private String ghichu;
	    

	    
	   

}
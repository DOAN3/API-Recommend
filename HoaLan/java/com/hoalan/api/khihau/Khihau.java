package com.hoalan.api.khihau;


import org.springframework.data.annotation.Id;

public class Khihau {
	  @Id
	    private String id;
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDat() {
		return dat;
	}
	public void setDat(String dat) {
		this.dat = dat;
	}
	public String getDoam() {
		return doam;
	}
	public void setDoam(String doam) {
		this.doam = doam;
	}
	public String getAnhsang() {
		return anhsang;
	}
	public void setAnhsang(String anhsang) {
		this.anhsang = anhsang;
	}
		private String dat;
		private String doam;
		private String anhsang;
	    

	    
	   

}
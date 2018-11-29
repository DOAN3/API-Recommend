package com.hoalan.api.hotro;


import org.springframework.data.annotation.Id;

public class Hotro {
	  @Id
	    private String id;
	    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
		private String noidung;
	    

	    
	   

}
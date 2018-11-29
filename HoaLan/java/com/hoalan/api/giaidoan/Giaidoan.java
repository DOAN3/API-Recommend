package com.hoalan.api.giaidoan;


import org.springframework.data.annotation.Id;

public class Giaidoan {
	  @Id
	    private String id;

		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNaymam() {
		return naymam;
	}
	public void setNaymam(String naymam) {
		this.naymam = naymam;
	}
	public String getSinhtruong() {
		return sinhtruong;
	}
	public void setSinhtruong(String sinhtruong) {
		this.sinhtruong = sinhtruong;
	}
	public String getNohoa() {
		return nohoa;
	}
	public void setNohoa(String nohoa) {
		this.nohoa = nohoa;
	}
	public String getBaoquan() {
		return baoquan;
	}
	public void setBaoquan(String baoquan) {
		this.baoquan = baoquan;
	}
		private String naymam;
		private String sinhtruong;
		private String nohoa;
		private String baoquan;
	    

	    
	   

}
package com.hoalan.api.lan;


import org.springframework.data.annotation.Id;

public class Lan {
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
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getChitiet() {
		return chitiet;
	}
	public void setChitiet(String chitiet) {
		this.chitiet = chitiet;
	}
	public String getDacdiem() {
		return dacdiem;
	}
	public void setDacdiem(String dacdiem) {
		this.dacdiem = dacdiem;
	}
		private String ten;
	    private String trangthai;
	    private String chitiet;
	    private String dacdiem;
	    

	    
	   

}
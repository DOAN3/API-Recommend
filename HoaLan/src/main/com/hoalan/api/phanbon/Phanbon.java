package com.hoalan.api.phanbon;




import java.util.Date;

import org.springframework.data.annotation.Id;

public class Phanbon {
	  @Id
	    private String id;

		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTenhoa() {
		return tenhoa;
	}
	public void setTenhoa(String tenhoa) {
		this.tenhoa = tenhoa;
	}
	public String getTenphanbon() {
		return tenphanbon;
	}
	public void setTenphanbon(String tenphanbon) {
		this.tenphanbon = tenphanbon;
	}
	public int getLieuluong() {
		return lieuluong;
	}
	public void setLieuluong(int lieuluong) {
		this.lieuluong = lieuluong;
	}
	public Date getThoigian() {
		return thoigian;
	}
	public void setThoigian(Date thoigian) {
		this.thoigian = thoigian;
	}
		private String tenhoa;
		private String tenphanbon;
		
		private int lieuluong;
		private Date thoigian;
		

	    
	   

}
package com.hoalan.api.kho;




import java.util.Date;

import org.springframework.data.annotation.Id;

public class Kho {
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
	public Date getThoigiannhap() {
		return thoigiannhap;
	}
	public void setThoigiannhap(Date thoigiannhap) {
		this.thoigiannhap = thoigiannhap;
	}
	public int getSoluongnhap() {
		return soluongnhap;
	}
	public void setSoluongnhap(int soluongnhap) {
		this.soluongnhap = soluongnhap;
	}
	public Date getThoigianxuat() {
		return thoigianxuat;
	}
	public void setThoigianxuat(Date thoigianxuat) {
		this.thoigianxuat = thoigianxuat;
	}
	public String getSoluongxuat() {
		return soluongxuat;
	}
	public void setSoluongxuat(String soluongxuat) {
		this.soluongxuat = soluongxuat;
	}
	public String getBaoquan() {
		return baoquan;
	}
	public void setBaoquan(String baoquan) {
		this.baoquan = baoquan;
	}
		private String tenhoa;
		private Date thoigiannhap;
		private int soluongnhap;
		private Date thoigianxuat;
		private String soluongxuat;
		private String baoquan;
	    

	    
	   

}
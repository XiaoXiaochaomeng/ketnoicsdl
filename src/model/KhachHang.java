package model;

import java.sql.Date;

public class KhachHang {
	private int id;
	private String hovaten;
	private Date ngaysinh;
	private String diachi;
	public KhachHang() {
		
	}
	public KhachHang(int id, String hovaten, Date ngaysinh, String diachi) {
		this.id = id;
		this.hovaten = hovaten;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
}

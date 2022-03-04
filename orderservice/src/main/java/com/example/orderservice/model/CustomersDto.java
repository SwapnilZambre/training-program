package com.example.orderservice.model;

public class CustomersDto {
	int oid;
	int cid;
	String productname;
	int price;
	public CustomersDto() {
		
	}
	public CustomersDto(int oid, int cid, String productname, int price) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.productname = productname;
		this.price = price;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
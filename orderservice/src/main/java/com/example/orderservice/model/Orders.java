package com.example.orderservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	int oid;
	@Id
	int cid;
	String productname;
	float price;
	public Orders() {
		
	}
	public Orders(int oid, int cid, String productname, float price) {
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
	public void setPrice(float price) {
		this.price = price;
	}

}

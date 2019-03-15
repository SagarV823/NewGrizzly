package com.cts.product.bean;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "Vendors_table")


public class Vendors {
	
	private String id;
	private String name;
	private String contactno;
	private String address;
	
	 
	@Id
	@Column(name = "VendorId")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Vendors [id=" + id + ", name=" + name + ", contactno=" + contactno + ", address=" + address + "]";
	}
	
	
	
	
}

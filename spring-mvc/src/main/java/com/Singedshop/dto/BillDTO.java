package com.Singedshop.dto;


public class BillDTO {
	private int idBill;
	private String phone;
	private String email;
	private int totalQuanty;
	private String address;
	boolean gender ;
	String orderDate ; 
	String  status ;   // Pending confirmation , Confirmed
	private double totalPrice;
	BillDetailDTO billDetail ; 
	
	 public boolean hasNullFields() {
	        return this.address == null || this.phone == null || this.email == null;
	    }
	
	

	public BillDetailDTO getBillDetail() {
		return billDetail;
	}
	
	public void setBillDetail(BillDetailDTO billDetail) {
		this.billDetail = billDetail;
	}
	
	public int getIdBill() {
		return idBill;
	}
	
	public void setIdBill(int idBill) {
		this.idBill = idBill;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getTotalQuanty() {
		return totalQuanty;
	}
	
	public void setTotalQuanty(int totalQuanty) {
		this.totalQuanty = totalQuanty;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public boolean isGender() {
		return gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String isStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	} 
	
	
	
}

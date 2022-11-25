package com.MotorbikeStore.model; //hung dl tu db tra vè

public class userModel {
	private int userId;
	private int roleId; 
	private String userPass; 
	private String userName; 
	private int numPhone; 
	private String email; 
	private String address; 
	private int cccd;
	private int moneyPurchased; 
	private int checkDelete;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return roleId;
	}
	
	public void setCCCD(int cccd) {
		this.cccd = cccd;
	}
	public int getCCCD() {
		return cccd;
	}
	
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getNumPhone() {
		return numPhone;
	}
	public void setNumPhone(int numPhone) {
		this.numPhone = numPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String i) {
		this.email = i;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoneyPurchased() {
		return moneyPurchased;
	}
	public void setMoneyPurchased(int moneyPurchased) {
		this.moneyPurchased = moneyPurchased;
	}
	public int getCheckDelete() {
		return checkDelete;
	}
	public void setCheckDelete(int checkDelete) {
		this.checkDelete = checkDelete;
	}
	
	
}

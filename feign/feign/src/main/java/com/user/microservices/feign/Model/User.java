package com.user.microservices.feign.Model;

import java.sql.Date;

public class User {
	
	private String userId;
	private String userName;
    private String userAddress;
    private String hotelId;
    private Date checkIn;
    private Date checkOut;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public User(String userId, String userName, String userAddress, String hotelId, Date checkIn, Date checkOut) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.hotelId = hotelId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", hotelId="
				+ hotelId + ", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}

}

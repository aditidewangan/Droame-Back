package com.manage.OEMS.model;

import java.sql.Date;


public class Booking {
	
	private int bookingId;
	private Date date;
	private int guestCount;
	private String eventName;
	private int eventCost;
	private int totalCost;
	private String paymentStatus;
	private int memberId;
	private int venueId;
	private int delStatus ;
	
	
	public Booking() {
		super();
	}

	public Booking(int bookingId, Date date, int guestCount, String eventName, int eventCost, int totalCost,
			String paymentStatus, int memberId, int venueId) {
		super();
		this.bookingId = bookingId;
		this.date = date;
		this.guestCount = guestCount;
		this.eventName = eventName;
		this.eventCost = eventCost;
		this.totalCost = totalCost;
		this.paymentStatus = paymentStatus;
		this.memberId = memberId;
		this.venueId = venueId;
	}
	
	public int getDelStatus() {
		return delStatus;
	}
	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}
	public int getBookingId(){
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getGuestCount() {
		return guestCount;
	}
	public void setGuestCount(int guestCount) {
		this.guestCount = guestCount;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getEventCost() {
		return eventCost;
	}
	public void setEventCost(int eventCost) {
		this.eventCost = eventCost;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", date=" + date + ", guestCount=" + guestCount + ", eventName="
				+ eventName + ", eventCost=" + eventCost + ", totalCost=" + totalCost
				+ ", paymentStatus=" + paymentStatus + ", memberId=" + memberId + ", venueId=" + venueId
				+ "]";
	}
	
	
	
	
}

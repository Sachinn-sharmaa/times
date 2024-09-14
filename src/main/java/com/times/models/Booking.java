package com.times.models;

import java.util.Date;
import java.util.List;

public class Booking {
	
	//Details of who booked, how many seats booked, which movie,payment...every thing.
	private String bookingId;
	private Date bookingDate;
	private Member member;
	private Auditorium auditorium;
	private Show show;
	private BookingStatus bookingStatus;
	private double totalAmount;
	private List<Seat> seats;
	private Payment paymentObj;
	
	

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(String bookingId, Date bookingDate, Member member, Auditorium auditorium, Show show,
			BookingStatus bookingStatus, double totalAmount, List<Seat> seats, Payment paymentObj) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.member = member;
		this.auditorium = auditorium;
		this.show = show;
		this.bookingStatus = bookingStatus;
		this.totalAmount = totalAmount;
		this.seats = seats;
		this.paymentObj = paymentObj;
	}



	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Auditorium getAuditorium() {
		return auditorium;
	}

	public void setAuditorium(Auditorium auditorium) {
		this.auditorium = auditorium;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public Payment getPaymentObj() {
		return paymentObj;
	}

	public void setPaymentObj(Payment paymentObj) {
		this.paymentObj = paymentObj;
	}
	
	

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", member=" + member
				+ ", auditorium=" + auditorium + ", show=" + show + ", bookingStatus=" + bookingStatus
				+ ", totalAmount=" + totalAmount + ", seats=" + seats + ", paymentObj=" + paymentObj + "]";
	}

	public boolean makePayment(Payment payment) {
		return false;
	}//api for making payment

		

}

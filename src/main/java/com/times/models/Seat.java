package com.times.models;


public class Seat {
	//Details of seat
	private int seatId;
	private SeatType seatType;
	private SeatStatus seatStatus;
	private Double price;
	
	
	public Seat(int seatId, SeatType seatType, SeatStatus seatStatus, Double price) {
		super();
		this.seatId = seatId;
		this.seatType = seatType;
		this.seatStatus = seatStatus;
		this.price = price;
	}


	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getSeatId() {
		return seatId;
	}


	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}


	public SeatType getSeatType() {
		return seatType;
	}


	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}


	public SeatStatus getSeatStatus() {
		return seatStatus;
	}


	public void setSeatStatus(SeatStatus seatStatus) {
		this.seatStatus = seatStatus;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatType=" + seatType + ", seatStatus=" + seatStatus + ", price=" + price
				+ "]";
	}
}

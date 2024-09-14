package com.times.models;

import java.util.Date;

public class Payment {
	private double amount;
	private Date paymentDate;
	private int transactionId;
	private PaymentStatus paymentStatus;
	
	
	public Payment(double amount, Date paymentDate, int transactionId, PaymentStatus paymentStatus) {
		super();
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.transactionId = transactionId;
		this.paymentStatus = paymentStatus;
	}
	
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public Date getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}


	public int getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}


	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	@Override
	public String toString() {
		return "Payment [amount=" + amount + ", paymentDate=" + paymentDate + ", transactionId=" + transactionId
				+ ", paymentStatus=" + paymentStatus + "]";
	}
	

}

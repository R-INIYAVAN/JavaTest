package com.hexaware.model;

public class Payment {
	private int PaymentId;
	private String PaymentDate;
	private double PaymentAmount;
	private int ClientId;
	
	public Payment() {
		System.out.println("Calling Payment Constraint...");
	}
	
	public Payment(int PaymentId,String PaymentDate,double PaymentAmount,int ClientId) {
		this.ClientId = ClientId;
		this.PaymentId = PaymentId;
		this.PaymentAmount = PaymentAmount;
		this.PaymentDate = PaymentDate;
	}
	
	public void setPaymentId(int PaymentId) {
		this.PaymentId = PaymentId;
	}
	
	public int getPaymentId() {
		return PaymentId;
	}
	
	public void setPaymentDate(String PaymentDate) {
		this.PaymentDate = PaymentDate;
	}
	
	public String getPaymentDate() {
		return PaymentDate;
	}
	
	public void setPaymentAmount(double PaymentAmount) {
		this.PaymentAmount = PaymentAmount;
	}
	
	public double getPaymentAmount() {
		return PaymentAmount;
	}
	
	public void setClientId(int ClientId) {
		this.ClientId = ClientId;
	}
	
	public int getClientId() {
		return ClientId;
	}
	
	
}

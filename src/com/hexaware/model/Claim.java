package com.hexaware.model;

public class Claim {
	private int ClaimId;
	private int ClaimNumber;
	private String DateField;
	private double ClaimAmount;
	private String Status;
	private String Policy;
	private int ClientId;
	
	public Claim() {
		System.out.println("Calling Claim Constraint...");
	}
	
	public Claim(int ClaimId,int ClaimNumber,String DateField,double ClaimAmount,String Status,String Policy,int ClientId) {
		this.ClaimId = ClaimId;
		this.ClaimNumber = ClaimNumber;
		this.DateField = DateField;
		this.Status = Status;
		this.Policy = Policy;
		this.ClientId = ClientId;
		this.ClaimAmount = ClaimAmount;
	}
	
	public void setClaimId(int ClaimId) {
		this.ClaimId = ClaimId;
	}
	
	public int getClaimId() {
		return ClaimId;
	}
	
	public void setClaimNumber(int ClaimNumber) {
		this.ClaimNumber = ClaimNumber;
	}
	
	public int getClaimNumber() {
		return ClaimNumber;
	}
	
	public void setDateField(String DateField) {
		this.DateField = DateField;
	}
	
	public String getDateField() {
		return DateField;
	}
	
	public void setStatus(String Status) {
		this.Status = Status;
	}
	
	public String getStatus() {
		return Status;
	}
	
	public void setPolicy(String Policy) {
		this.Policy = Policy;
	}
	
	public String getPolicy() {
		return Policy;
	}
	
	public void setClientId(int ClientId) {
		this.ClientId = ClientId;
	}
	
	public int getClientId() {
		return ClientId;
	}
	
	public void setClaimAmount(double ClaimAmount) {
		this.ClaimAmount = ClaimAmount;
	}
	
	public double getClaimAmount() {
		return ClaimAmount;
	}
	
	
	
	
}

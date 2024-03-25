package com.hexaware.model;

public class Client {
	private int ClientId;
	private String Clientname;
	private String ContactInfo;
	private String Policy;
	
	public Client() {
		System.out.println("Calling Client Constraint...");
	}
	
	public Client(int ClientId,String Clientname,String ContactInfo,String Policy) {
		this.ClientId = ClientId;
		this.Clientname = Clientname;
		this.ContactInfo = ContactInfo;
		this.Policy = Policy;
	}
	
	public void setClientId(int ClientId) {
		this.ClientId = ClientId;
	}
	
	public int getClientId() {
		return ClientId;
	}
	
	public void setClientname(String Clientname) {
		this.Clientname = Clientname;
	}
	
	public String getClientname() {
		return Clientname;
	}
	
	public void setContactInfo(String ContactInfo) {
		this.ContactInfo = ContactInfo;
	}
	
	public String getContactInfo() {
		return ContactInfo;
	}
	
	public void setPolicy(String Policy) {
		this.Policy = Policy;
	}
	
	public String getPolicy() {
		return Policy;
	}
	
}

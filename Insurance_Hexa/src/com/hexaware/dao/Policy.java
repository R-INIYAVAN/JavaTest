package com.hexaware.dao;

import java.util.Scanner;
import com.hexaware.model.*;


public abstract class Policy implements IPolicyService{
	Client client = new Client();
	Claim claim = new Claim();
	Payment payment = new Payment();
	//DaoClass dao = new DaoClass();
	InsuranceService insuranceservice = new InsuranceService();
	
	Scanner sc = new Scanner(System.in);
	
	public void CreatePolicy() {
		
		// Client Date
		System.out.println("Enter the client id:");
		int clientid = sc.nextInt();
		client.setClientId(clientid);
		
		System.out.println("Enter client name:");
		String clientname = sc.next();
		client.setClientname(clientname);
		
		System.out.println("Enter client contact info:");
		String contactinfo = sc.next();
		client.setContactInfo(contactinfo);
		
		System.out.println("Enter client policy:");
		String policy = sc.next();
		client.setPolicy(policy);
		
		// Claim Data
		System.out.println("Enter the claim id:");
		int claimid = sc.nextInt();
		claim.setClaimId(claimid);
		
		System.out.println("Enter the claim number:");
		int claimnumber = sc.nextInt();
		claim.setClaimNumber(claimnumber);
		
		claim.setClientId(clientid);
		
		System.out.println("Enter Date Field:");
		String datefield = sc.next();
		claim.setDateField(datefield);
		
		System.out.println("Enter the claim Amount:");
		double claimamount = sc.nextDouble();
		claim.setClaimAmount(claimamount);
		
		claim.setPolicy(policy);
		
		System.out.println("Enter Status:");
		String status = sc.next();
		claim.setStatus(status);
		
		// Payment Data
		payment.setClientId(clientid);
		
		System.out.println("Enter the Payment Id:");
		int paymentid = sc.nextInt();
		payment.setPaymentAmount(paymentid);
		
		System.out.println("Enter the Payment Amount:");
		double paymentamount = sc.nextDouble();
		payment.setPaymentAmount(paymentamount);
		
		System.out.println("Enter the Payment Date:");
		String paymentdate = sc.next();
		payment.setPaymentDate(paymentdate);
		
		insuranceservice.CreatePolicyService(client,claim,payment);
		
		//dao.CreatePolicyDao(client,claim,payment);
		
	}
	
	public void DeletePolicy() {
		//clientId
		//claimId
		//paymentId
		System.out.println("Enter ClientId of deletion:");
		int clientid = sc.nextInt();
		client.setClientId(clientid);
		
		System.out.println("Enter ClaimId of deletion:");
		int claimid = sc.nextInt();
		claim.setClaimId(claimid);
		
		System.out.println("Enter PaymentId of deletion:");
		int paymentid = sc.nextInt();
		payment.setPaymentAmount(paymentid);
		
		insuranceservice.DeletePolicyService(client.getClientId(),claim.getClaimId(),payment.getPaymentId());
		
		//dao.DeletePolicyDao(client.getClientId(),claim.getClaimId(),payment.getPaymentId());
	}
	
	public void GetAllPolicies() {
		System.out.println("Getting all policies /n");
		
		insuranceservice.GetAllPoliciesService();
		//dao.GetAllPolicies();
	}
	
	public void GetPolicy() {
		System.out.println("Enter ClientId of Policy:");
		int clientid = sc.nextInt();
		client.setClientId(clientid);
		
		System.out.println("Enter ClaimId of Policy:");
		int claimid = sc.nextInt();
		claim.setClaimId(claimid);
		
		System.out.println("Enter PaymentId of Policy:");
		int paymentid = sc.nextInt();
		payment.setPaymentAmount(paymentid);
		
		insuranceservice.GetPolicyService(client.getClientId(),claim.getClaimId(),payment.getPaymentId());
		//dao.GetPolicyDao(client.getClientId(),claim.getClaimId(),payment.getPaymentId());
		
	}
	
	public void UpdatePolicy() {
		System.out.println("Enter ClientId of Policy for updation:");
		int clientid = sc.nextInt();
		client.setClientId(clientid);
		
		System.out.println("Enter ClaimId of Policy for updation:");
		int claimid = sc.nextInt();
		claim.setClaimId(claimid);
		
		System.out.println("Enter PaymentId of Policy updation:");
		int paymentid = sc.nextInt();
		payment.setPaymentAmount(paymentid);
		
		insuranceservice.UpdatePolicyService(client.getClientId(),claim.getClaimId(),payment.getPaymentId());
		//dao.UpdatePolicyDao(client.getClientId(),claim.getClaimId(),payment.getPaymentId());
		
	}
	
}

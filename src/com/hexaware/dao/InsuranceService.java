package com.hexaware.dao;

import com.hexaware.model.Claim;
import com.hexaware.model.Client;
import com.hexaware.model.Payment;

public class InsuranceService {
	DaoClass dao = new DaoClass();

	public void CreatePolicyService(Client client, Claim claim, Payment payment) {
		dao.CreatePolicyDao(client,claim,payment);
	}

	public void DeletePolicyService(int clientId, int claimId, int paymentId) {
		dao.DeletePolicyDao(clientId,claimId,paymentId);
	}

	public void GetAllPoliciesService() {
		dao.GetAllPolicies();
	}

	public void GetPolicyService(int clientId, int claimId, int paymentId) {
		dao.GetPolicyDao(clientId,claimId,paymentId);
	}

	public void UpdatePolicyService(int clientId, int claimId, int paymentId) {
		dao.UpdatePolicyDao(clientId,claimId,paymentId);
	}
	
	
	
	
}

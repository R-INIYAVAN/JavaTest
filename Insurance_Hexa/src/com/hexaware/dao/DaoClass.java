package com.hexaware.dao;

import java.sql.*;
import com.hexaware.exception.PolicyNotFoundException;
import java.util.Scanner;

import com.hexaware.util.*;
import com.hexaware.util.DBUtil;
import com.hexaware.model.*;

public class DaoClass {
	Connection com;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	Scanner sc = new Scanner(System.in);
	
	public void CreatePolicyDao(Client client, Claim claim, Payment payment) {
		try {
			com = DBUtil.getDBConn();
			try {
				ps = com.prepareStatement("insert into client values(?,?,?,?)");
				ps.setInt(1, client.getClientId());
				ps.setString(2, client.getClientname());
				ps.setString(3, client.getContactInfo());
				ps.setString(4, client.getPolicy());
				
				int no = ps.executeUpdate();
				System.out.println(no+" row inserted in client");
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				ps = com.prepareStatement("insert into claim values(?,?,?,?,?,?,?)");
				ps.setInt(1, claim.getClaimId());
				ps.setInt(2, claim.getClaimNumber());
				ps.setString(3, claim.getDateField());
				ps.setDouble(4, claim.getClaimAmount());
				ps.setString(5,claim.getStatus());
				ps.setString(6,claim.getPolicy());
				ps.setInt(7,claim.getClientId());
				
				int no = ps.executeUpdate();
				System.out.println(no+" row inserted in claim");
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				ps = com.prepareStatement("insert into payment values(?,?,?,?)");
				ps.setInt(1, payment.getPaymentId());
				ps.setString(2, payment.getPaymentDate());
				ps.setDouble(3, payment.getPaymentAmount());
				ps.setInt(4, payment.getClientId());
				
				int no = ps.executeUpdate();
				System.out.println(no+" row inserted in payment");
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void DeletePolicyDao(int clientId, int claimId, int paymentId) {
		try {
			com = DBUtil.getDBConn();
			
			try {
				ps = com.prepareStatement("delete from client where clientid=?");
				ps.setInt(1, clientId);
				
				int no = ps.executeUpdate();
				System.out.println(no+" row deleted from client");
				
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			catch (PolicyNotFoundException p) {
				
			}
			try {
				ps = com.prepareStatement("delete from claim where claimid=?");
				ps.setInt(1, claimId);
				
				int no = ps.executeUpdate();
				System.out.println(no+" row deleted from claim");
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				ps = com.prepareStatement("delete from payment where paymentid=?");
				ps.setInt(1, paymentId);
				
				int no = ps.executeUpdate();
				System.out.println(no+" row deleted from payment");
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void GetAllPolicies() {
		try {
			com = DBUtil.getDBConn();
			
			try {
				com = DBUtil.getDBConn();
				stmt = com.createStatement();
				rs = stmt.executeQuery("select * from client");
				while(rs.next()) {
					System.out.println("clientid is "+rs.getInt(1));
					System.out.println("client name is "+rs.getString(2));
					System.out.println("client contact is "+rs.getString(3));
					System.out.println("client policy is "+rs.getString(4));
				}
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				com = DBUtil.getDBConn();
				stmt = com.createStatement();
				rs = stmt.executeQuery("select * from claim");
				while(rs.next()) {
					System.out.println("claimid is "+rs.getInt(1));
					System.out.println("claim number is "+rs.getInt(2));
					System.out.println("claim datefield is "+rs.getString(3));
					System.out.println("claim amount is "+rs.getDouble(4));
					System.out.println("claim status is "+rs.getString(5));
					System.out.println("claim policy is "+rs.getString(6));
					System.out.println("client id is "+rs.getInt(7));
				}
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				com = DBUtil.getDBConn();
				stmt = com.createStatement();
				rs = stmt.executeQuery("select * from payment");
				while(rs.next()) {
					System.out.println("paymentid is "+rs.getInt(1));
					System.out.println("payment date is "+rs.getString(2));
					System.out.println("payment amount is "+rs.getDouble(3));
					System.out.println("client id is "+rs.getInt(4));
				}
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void GetPolicyDao(int clientId, int claimId, int paymentId) {
		try {
			com = DBUtil.getDBConn();
			
			try {
				stmt = com.createStatement();
				rs = stmt.executeQuery("select * from client where clientid="+clientId);
				while(rs.next()) {
					System.out.println("clientid is "+rs.getInt(1));
					System.out.println("client name is "+rs.getString(2));
					System.out.println("client contact is "+rs.getString(3));
					System.out.println("client policy is "+rs.getString(4));
				}
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				stmt = com.createStatement();
				rs = stmt.executeQuery("select * from claim where claimid="+claimId);
				while(rs.next()) {
					System.out.println("claimid is "+rs.getInt(1));
					System.out.println("claim number is "+rs.getInt(2));
					System.out.println("claim datefield is "+rs.getString(3));
					System.out.println("claim amount is "+rs.getDouble(4));
					System.out.println("claim status is "+rs.getString(5));
					System.out.println("claim policy is "+rs.getString(6));
					System.out.println("client id is "+rs.getInt(7));
				}
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				stmt = com.createStatement();
				rs = stmt.executeQuery("select * from payment where paymentid="+paymentId);
				while(rs.next()) {
					System.out.println("paymentid is "+rs.getInt(1));
					System.out.println("payment date is "+rs.getString(2));
					System.out.println("payment amount is "+rs.getDouble(3));
					System.out.println("client id is "+rs.getInt(4));
				}
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void UpdatePolicyDao(int clientId, int claimId, int paymentId) {
		try {
			com = DBUtil.getDBConn();
			
			try {
				ps = com.prepareStatement("update client set clientname=? where clientid=?");
				System.out.println("Enter new client name");
				String newclientname = sc.next();
				ps.setString(1, newclientname);
				ps.setInt(2, clientId);
				
				int no = ps.executeUpdate();
				System.out.println(no+" row updated from client");
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				ps = com.prepareStatement("update claim set claimamount=? where claimid=?");
				System.out.println("Enter new client name");
				String newclaimamount = sc.next();
				ps.setString(1, newclaimamount);
				ps.setInt(2, claimId);
				
				int no = ps.executeUpdate();
				System.out.println(no+" row updated from claim");
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				ps = com.prepareStatement("update claim set paymentamount=? where paymentid=?");
				System.out.println("Enter new client name");
				String newpaymentamount = sc.next();
				ps.setString(1, newpaymentamount);
				ps.setInt(2, paymentId);
				
				int no = ps.executeUpdate();
				System.out.println(no+" row updated from payment");
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}

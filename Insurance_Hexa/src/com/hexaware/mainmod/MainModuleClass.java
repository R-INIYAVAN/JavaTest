package com.hexaware.mainmod;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.dao.*;

public class MainModuleClass {
	public static void main(String[] args) throws SQLException{
		
		Policy policy = new Policy();
		String ch = null;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("What Service would you like to access");
			System.out.println("1. CreatePolicy\n2. DeletePolicy\n3. GetAllPolicies\n4."
					+ " GetPolicy\n5. UpdatePolicy");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:{
					policy.CreatePolicy();
					break;
				}
				
				case 2:{
					policy.DeletePolicy();
					break;
				}
				
				case 3:{
					policy.GetAllPolicies();
					break;
				}
				
				case 4:{
					policy.GetPolicy();
					break;
				}
				
				case 5:{
					policy.UpdatePolicy();
					break;
				}
			}
			System.out.println("Do you want to continue? Y or y");
			ch = sc.next();
		}while(ch.equals("Y") || ch.equals("y"));
		System.out.println("Thank you Visit Again!"+ "!!");
		System.exit(0);
	}
}

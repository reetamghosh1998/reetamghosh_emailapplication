package com.reetam.main;

import java.util.Scanner;

import com.reetam.model.Employee;
import com.reetam.service.CredentialService;

public class Driver {

	public static void main(String args[]) {
		
		Employee employee = new Employee("Reetam","Ghosh");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;

		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical\n2.Admin\n3.Human Resource\n4.Legal");
		System.out.println("Enter your choice");
		
		Scanner sc=new Scanner (System.in);
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"tech");
			generatedPassword=cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
			
		case 2:
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"admin");
			generatedPassword=cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
			
		case 3:
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"hr");
			generatedPassword=cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
			
		case 4:
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"legal");
			generatedPassword=cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;	
		
		default:
			System.out.println("Please provide the correct department");
			break;
			
		}
	}
	
}

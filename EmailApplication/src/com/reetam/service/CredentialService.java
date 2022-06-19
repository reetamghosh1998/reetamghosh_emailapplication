package com.reetam.service;

import java.util.Random;

import com.reetam.model.Employee;

public class CredentialService {

	public char[] generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "";
		String numbers = "";
		String specialCharacters = "";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		//using random method
		Random random = new Random();

		char[] password=new char[8]; //password[0], password[1]....password[7]

		for (int i=0; i<8; i++) {

			password[i]= values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";

	}

	public void showCredentials(Employee employee, String email, char[] generatedPasword) {
		System.out.println(employee.getFirstName()+" your generated credentials");
		System.out.println("Email is" +email);
		System.out.print("Password is " );
		System.out.print(generatedPasword);

	}

}

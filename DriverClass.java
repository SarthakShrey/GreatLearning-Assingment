package com.greatlearning.services;

import com.greatlearning.services.Employee;
import java.util.Scanner;
public class DriverClass {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Sarthak" , "Shrey");
		String generatedEmail;
		char[] generatedPassword;
		CredentialService cService = new CredentialService();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("Please Enter the Dept. from the following");
		System.out.println("1. Technical Dept.");
		System.out.println("2. Admin Dept.");
		System.out.println("3. Human Resource Dept.");
		System.out.println("4. Legal Dept.");
		
		choice = sc.nextInt();
		
		if (choice == 1) {
			
			generatedEmail = cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "Technical");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if (choice == 2) {
			generatedEmail = cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "Admin");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if (choice == 3) {
			generatedEmail = cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "Human Resource");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if (choice == 4) {
			generatedEmail = cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "Legal");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else {
			System.out.println("Invalid choice");
		}
	}



}

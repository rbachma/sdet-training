package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String email;
	private String alternateEmail;
	private static String domain = "xyz.com";
	
	//Constructor to receive first and last names
	public Email (String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname; 
		this.department = setDepartment();
		this.password = randomPassword(defaultPasswordLength);
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department +  "." + domain; 
		
	}
	//ask for department
	private String setDepartment(){
		System.out.println("DEPARTMENT CODES:\n1 : Sales\n2 : Development\n3 : Account\n0 : None\nEnter the department code:  ");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if (departmentChoice == 1) {return "Sales";}
		if (departmentChoice == 2) {return "Development";}
		if (departmentChoice == 3) {return "Account";}
		if (departmentChoice == 0) {return "None";}
		else { return "";}
	}
	
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMOPQRSTUVWXYZ1234567890!@#$%^&*()";
		char[] password = new char[length];
		for (int i = 0; i < length; i++){
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	public void setAltEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	public void changePassword(String password){
		this.password = password;
	}
	public int getMailboxCapacity(){return mailboxCapacity;}
	public String getAltEmail(){return alternateEmail;}
	public String getPassword(){ return password;}
	//Generate random password
	
	public String showInfo(){
		return "DISPLAY NAME: " + firstname + " " + lastname + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity;
		
	}
	//Set alternate email
	
}

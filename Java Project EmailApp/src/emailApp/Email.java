package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity = 250;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "emaiApp.com";
	
	//constructor receive last name and first name
	 public Email(String firstName, String lastName){
		 this.firstName =  firstName;
		 this.lastName = lastName;
		
		 //calling a method asking for department
		 this.department = setDepartment();
		// System.out.println("Department: "+ this.department);
		 
		 // call a method that return a random password
		 this.password = randomPassword(defaultPasswordLength);
		 System.out.println("Your password is: "+ this.password);
		 
		 //combine elements to generate email
		 email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		
	 }
	//ask for the department
	 private String setDepartment(){
		 System.out.print("New worker: "+ firstName + " Department Codes\n1 for Sales\n2 for Development\n3 for accounting\n0 for none\n Enter Department code: ");
		 Scanner in = new Scanner(System.in);
		 int depChoice = in.nextInt();
		 if(depChoice==1){return "Sales";}
		 else if(depChoice==2){return "Development";}
		 else if(depChoice==3){return "Accounting";}
		 else {return "no department";}
		 
	 }
	 // Generate a random password
	 private String randomPassword(int length){
		 String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 char[] password = new char[length];
		 for (int i=0; i<length; i++){
			 int rand = (int) (Math.random()* passwordSet.length());
			 password[i] = passwordSet.charAt(rand);
			 
		 }
		 return new String(password);
	 }
	 //set the mailbox capacity
	 public void setMailboxcapacity(int capacity){
		 this.mailboxCapacity = capacity;
		 
	 }
	 //set the alternate email
	 public void setAlternateEmail(String altEmail){
		 this.alternateEmail = altEmail; 
	 }
	 
	//Change the Password
	public void changePassword(String password){
			 this.password = password;
		 }
	public int getMailboxCapacity(){return mailboxCapacity;}
	public String getAlternateEmail(){return alternateEmail;}
	public String getPassword(){return password;}
	
	public String showInfo(){
		return "Display Name: "+firstName+" "+lastName+"\nCompany Email: "+email+"\nMailBox Capacity: "+ mailboxCapacity+" mb ";
	}

}

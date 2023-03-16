package Project1;
import java.util.Scanner;
public class UserDetails {
    String name;
    int age;
    String phNumber;
    String mailId;
   /* UserDetails(String name, int age, String phNumber, String mailId)
    {
    	this.name=name;
    	this.age=age;
    	this.phNumber=phNumber;
    	this.mailId=mailId;
    } or */
    Scanner inp = new Scanner(System.in);
    void getDetails()
    {   //gets deatils from user
    	System.out.println("*******Register******");
    	System.out.println("Enter your name: ");
    	name=inp.next();
    	System.out.println("Enter your age:");
    	age=inp.nextInt();
    	System.out.println("Enter your phone number: ");
    	phNumber=inp.next();
    	System.out.println("Enter your mail id: ");
    	mailId=inp.next();
    	System.out.println();
    }
    void displayDetails()
    {   //displays details entered by user
    	if(name.equals(null))
    	{   //incase user trying to view details before even entering them
    		System.out.println("First you have to Register!");
    		System.out.println();
    	}
    	else {
    		System.out.println("Your Details: ");
        	System.out.println("Name: "+name+"\nAge: "+age+"\nPhone Number: "+phNumber+"\nMail Id: "+mailId);
        	System.out.println("*******Thank you for Registering!******");
        	System.out.println();
    	}
    }
}

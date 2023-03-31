package Email;

import java.util.Random;
import java.util.Scanner;

public class Emailapplication 
{
	Scanner sc=new Scanner(System.in);
	private String Fname;
	private String Lname;
	private String Dept;
	private String Email;
	private String Password;
	private int mailCapacity=500;
	private String Alter_Email;
	
	//Constructor to receive the First name and Last name
	public Emailapplication(String Fname,String Lname)
	{
		this.Fname=Fname;
		this.Lname=Lname;
		System.out.println("Email Created :"+this.Fname+" "+this.Lname);
		
		//call a method asking for the department
		this.Dept=this.setDept();
		this.Password=this.randomPassword(8);
		this.Email=this.EmailCreated();
	}
	
	private String EmailCreated()
	{
		return this.Fname.toLowerCase()+this.Lname.toLowerCase()+"@"+this.Dept.toLowerCase()+".company.com";
	}
	
	//Ask for the Department
	private String setDept()
	{
		System.out.println("Department codes \n1 for sales \n2 for Development \n3 for Accounting \n0 for none");
		boolean flag=false;
		do 
		{
			System.out.println("Enter Department code");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				return "sales";
			case 2:
				return "Development";
			case 3:
				return "Accounting";
			case 0:
				return "None";
			default:
				System.out.println("Invalid choice please choose it again");
					
			}
		}while(!flag);
		return null;
	}
	
	//Generate Random Password
	private String randomPassword(int length)
	{
		String capitalCaseLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters= "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters="!@#$";
		String numbers= "1234567890";
		String combinedChars= capitalCaseLetters+lowerCaseLetters+specialCharacters+numbers;
		Random r=new Random();
		String password="";
		for(int i=0;i<length;i++)
		{
			password=password+combinedChars.charAt(r.nextInt(combinedChars.length()));
		}
		return password;
	}
	
	//Change Password
	public void SetPassword()
	{
		boolean flag=false;
		do
		{
			System.out.println("Do you want to change your password ? (Y/N)");
			char choice=sc.next().charAt(0);
			if(choice=='Y' || choice=='y')
			{
				flag=true;
				System.out.println("Enter current Password :");
				String temp=sc.next();
				if(temp.equals(this.Password))
				{
					System.out.println("Enter new Password :");
					this.Password=sc.next();
					System.out.println("Password changed successfully");
				}
				else
				{
					System.out.println("Wrong Password");
				}
			}
			else if(choice=='N' || choice=='n')
			{
				flag=true;
				System.out.println("Password changed option cancelled!");
			}
			else
			{
				System.out.println("Enter valid choice");
			}
		}while(!flag);
	}
	
	//Set Mailbox Capacity
	public void SetMailboxCapacity()
	{
		System.out.println("Current Capacity : "+this.mailCapacity+": mb");
		System.out.println("Enter new Mailbox Capacity :");
		this.mailCapacity=sc.nextInt();
		System.out.println("Mailbox Capacity is successfully changed.");
	}
	
	//Alternate Email
	public void AlternateEmail()
	{
		System.out.println("Enter new alternate mail :");
		this.Alter_Email=sc.next();
		System.out.println("Alternate Email is successfully set.");
	}
	
	//Display user Information
	public void GetInfo()
	{
		System.out.println("New :"+this.Fname+" "+this.Lname);
		System.out.println("Department :"+this.Dept);
		System.out.println("Email :"+this.Email);
		System.out.println("Password :"+this.Password);
		System.out.println("Mailbox Capacity"+this.mailCapacity+"mb");
		System.out.println("Alternate mail :"+this.Alter_Email);
	}
}

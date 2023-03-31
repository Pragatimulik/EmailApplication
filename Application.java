package Email;

import java.util.Scanner;

public class Application
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First Name :");
		String fname=sc.next();
		System.out.println("Enter your Last Name :");
		String lname=sc.next();
		
		Emailapplication eml=new Emailapplication(fname, lname);
		int choice=-1;
		do
		{
			System.out.println("\n****************************\nEnter your choice\n1.Show Info"
					+ "\n2.change password\n3.change mailbox capacity\n4.set Alternate mail\n5.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				eml.GetInfo();
				break;
			case 2:
				eml.SetPassword();
				break;
			case 3:
				eml.SetMailboxCapacity();
				break;
			case 4:
				eml.AlternateEmail();
				break;
			case 5:
				System.out.println("Thank you for using application!");
			default :
				System.out.println("Invalid choice!!\nEnter proper choice again");
			}
		}while(choice!=5);
	}

}

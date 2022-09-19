package lab1.oops;

import java.util.Scanner;

public class MainPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String role = null;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Please enter the department from the following :"
					+ "\n1.Technical\n2.Admin\n3.Human Resource\n4.Legal");
			
			int selectedOption = sc.nextInt();
			
			switch(selectedOption){
				case 1:
					role = "tech";
					break;
				case 2:
					role = "admin";
					break;
				case 3:
					role = "humanresource";
					break;
				case 4:
					role = "legal";
					break;
					
				default:
					System.out.println("Please enter a valid option");
			}
		}while(role == null);
				
		if(role != null) {
			System.out.println("Enter First Name:");
			String firstName=sc.next();
			
			System.out.println("Enter Last Name:");
			String lastName=sc.next();
					
			CredentialService user1=new CredentialService(firstName,lastName,role);
			user1.showCredentials();
		}

	}

}

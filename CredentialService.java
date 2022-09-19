package lab1.oops;
import java.util.Random;
public class CredentialService extends Employee{
	
	CredentialService(String fN, String lN,String rl) {
		super(fN, lN,rl);
		// TODO Auto-generated constructor stub
	}

	public char[] generatePassword() {
		
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String specialChar = "~`!@#$%^&*()_-+={[}]|\\\\\\\\\\\\\\\\:;'<>?,./\\\"";
		String characters = upper+lower+num+specialChar;
		int len = 7;
		char[] password=new char[len];
		Random r=new Random();
		password[0]=upper.charAt(r.nextInt(upper.length()));
		password[1]=lower.charAt(r.nextInt(lower.length()));
		password[2]=num.charAt(r.nextInt(num.length()));
		password[3]=specialChar.charAt(r.nextInt(specialChar.length()));
		for(int i=4;i<len;i++)
			password[i]=characters.charAt(r.nextInt(characters.length()));
		//System.out.println(password);
		return password;
	}
	
	public String generateEmailAddress() {
		String emailID = super.getFirstName().toLowerCase()+super.getLastName().toLowerCase()+"@"+super.getRole()+".abc.com";
		//System.out.println(emailID);
		return emailID;
		
	}
	public void showCredentials() {
		System.out.println("Dear "+this.getFirstName() +" your generated credentials are as follows");
		System.out.println("Email    ---> "+this.generateEmailAddress());
		System.out.print("Password ---> ");
		for(char element:this.generatePassword())
			System.out.print(element);
		
		

	}

}

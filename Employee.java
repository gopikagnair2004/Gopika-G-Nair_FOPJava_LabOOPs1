package lab1.oops;

public class Employee {
	private String firstName;
	private String lastName;
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	Employee(String fN, String lN,String rl){
		this.firstName = fN;
		this.lastName = lN;
		this.role=rl;
	}
	

}

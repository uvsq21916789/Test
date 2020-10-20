
public class Fraction {

		
	private String firstName;
	private String lastName; 
	
	public Fraction(String firstName,String lastName) {
	
		 
		this.firstName = firstName;
		this.lastName = lastName;	
	}
	
@Override
	public String toString() {
		return firstName + " ....aa11a. " + lastName;
		} 
	
public static void main(String[] args) {

	Fraction user = new Fraction("Eladio", "Fernando");
	System.out.println(user.toString());  
	 


}
}

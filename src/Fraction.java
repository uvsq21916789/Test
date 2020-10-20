
public class Fraction {

		
	private String firstName;
	private String lastName;
	
	public Fraction(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;	
	}
	
/* @Override
	public String toString() {
		return firstName + " " + lastName;
		} */
	
public static void main(String[] args) {


	Fraction user = new Fraction("Fernandoo", "Eladio");
	System.out.println(user.toString()); 
	


}
}

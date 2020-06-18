
public class Employee {
	private String FirstName;
	private String LastName;
	 private static int count = 0;
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName) {
	
		FirstName = firstName;
		LastName = lastName;
		count++;
		
		System.out.printf("constructor %s %s count = %d%n",
				          FirstName, LastName, count);
	}
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public static int getCount() {
		return count;
	}
	
	

}

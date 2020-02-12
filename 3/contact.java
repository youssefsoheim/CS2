
public class contact implements Comparable{

	protected String lastName;
	protected String firstName;
	protected String number;
	protected String email;
	
	
	
	
	
	
	public contact(String lastName, String firstName, String number, String email) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.number = number;
		this.email = email;
	}






	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getNumber() {
		return number;
	}

	public String getEmail() {
		return email;
	}
	
	
@Override
    public int compareTo(Object o)
    {
       return lastName.compareTo((String)o);
    }










	
	
	
}

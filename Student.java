/**Create public class Student*/
public class Student  {
/**Create private string name
 * Create private string address
 * Create double gpa
 */
	private String name;
	private String address;
	private double gpa;
	/**Create constructor to initialize the instance variables*/
	public Student(String name, String address, double gpa) {
		this.name = name;
		this.address = address;
		this.gpa = gpa;
		
	}
	/**Create getter method for name*/
	public String getName() {
		return name;
	}
	/**Create setter method for name*/
	public void setName(String name) {
		this.name = name;
	}
	/**Create getter method for address*/
	public String getAddress() {
		return address;
	}
	/**Create setter method for address*/
	public void setAddress(String address) {
		this.address = address;
	}
	/**Create getter method for gpa*/
	public double getGpa() {
		return gpa;
	}
	/**Create setter method for gpa*/
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
}

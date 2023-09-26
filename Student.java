/**Create a class named Student*/
public class Student {
	/**Declare variables
	 * rollno integer
	 * name string
	 * address string
	 */
	int rollno;
	String name;
	String address;
	/**Define constructor for Student class with the paramaters:
	 * 
	 * @param rollno
	 * @param name
	 * @param address
	 */
	public Student(int rollno, String name, String address) {
		/**Initialize the variables inside constructor*/
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		
	}
	/**Define toString() method
	 * Override the default
	 * Return a string in the format:
	 * "Student: [rollno =" + rollno + "] [name  = " + name + "] [address =" + address +"]"
	 */
	@Override
	public String toString() {
		return "Student: [rollno =" + rollno + "] [name  = " + name + "] [address =" + address +"]";
	}
}

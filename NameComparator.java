import java.util.Comparator;
/**Create class named NameComparator that implements the Comparator interface for Student objects*/

public class NameComparator implements Comparator<Student>{
	/**Override the compare method
	 * Compare method takes two Student objects st1 and st2 and returns an integer
	 */
	@Override
	public int compare(Student st1, Student st2) {
		/**Call the compareTo method on st1.name and pass st2.name as a parameter.
		 * Return the result of the compareTo method as the result of the compare method 
		 */
		return st1.name.compareTo(st2.name);
	}

}

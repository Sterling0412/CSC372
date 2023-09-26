import java.util.Comparator;
/**Create class named RollNoComparator that implements the Comparator interface for Student objects
 * 
 */
public class RollNoComparator implements Comparator<Student>{
	/**Override the compare method
	 * The method takes two Student objects st1 and st2 as parameters and returns an integer
	 */
	@Override
	public int compare(Student st1, Student st2) {
		/**Subtract st2.rollno from st1.rollno
		 * Return the result of the subtraction as the result of the compare method
		 */
		return st1.rollno - st2.rollno;
	}
	

}

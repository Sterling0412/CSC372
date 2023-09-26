import java.util.ArrayList;
/**Create Main class*/
public class Main {
/**Define main method*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Create an empty ArrayList named students to store Student objects
		 * Add ten Student objects to the students ArrayList 
		 */
		ArrayList<Student> students = new ArrayList();
		students.add(new Student(6, "Reed Thomas", "234 Cherry Lane"));
		students.add(new Student(4, "April Gavens", "125 Frog Rd"));
		students.add(new Student(8, "Faith Eden", "659 Sweet Water Blvd"));
		students.add(new Student(1, "Mitchell Lewis", "375 GreenTree St"));
		students.add(new Student(2, "Gary Johnson", "149 BlueLake Dr"));
		students.add(new Student(5, "Mary Carrol", "934 Lagoon St"));
		students.add(new Student(7, "Tristen Weather", "576 Gray St."));
		students.add(new Student(9, "Matthew Dood", "546 N 23rd St"));
		students.add(new Student(10, "Rachel Matte", "2698 E 62 Highway"));
		students.add(new Student(3, "Leann Worthy", "2697 E Trainwreck Ave"));
		/** Print out Original List:
		 * Print the contents of stundents ArrayList
		 */
		System.out.println("Original List: ");
		System.out.println(students);
		
		/**Print out Sorted by Name
		 * Call on SelectionSortMethod with students ArrayList and new NameCaparator as parameters
		 * Print the contents of the students ArrayList after sorting by name 
		 */
		System.out.println("\nSorted by Name:");
		SelectionSortMethod.sort(students, new NameComparator());
		System.out.println(students);
		/**Print out Sorted by Roll Number
		 * Call on SelectionSortMethod with students ArrayList and new RollNoCaparator as parameters
		 * Print the contents of the students ArrayList after sorting by roll number 
		 */
		
		System.out.println("\nSorted by Roll Number:");
		SelectionSortMethod.sort(students, new RollNoComparator());
		System.out.println(students);
	}

}

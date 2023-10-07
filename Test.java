import java.io.*;
import java.util.*;
//Import require libraries
/**Create Test class*/
public class Test {
/**Introduce main method*/
	public static void main(String[] args) {
		/**Create scanner object scnr*/
		Scanner scnr = new Scanner(System.in);
		/**Create integer count*/
		int count = 0;
		/**Prompt user to enter number of students data will be entered for*/
		System.out.print("How many students data will you be entering?");
		/**Set count to input from user*/
		count = scnr.nextInt();
		/**Create LinkedList to store student objects*/
		List<Student> linkedlist= new LinkedList<Student>();
		/**Create string name
		 * Create string address
		 * Create double gpa
		 * Create variable to store student data from Student class
		 */
		String name;
		String address;
		double gpa;
		Student student;
		
		/**Create loop to input student data
		 * Create new line character in the buffer
		 * Prompt user to input student name and set to variable name
		 * Prompt user to input student address and set to variable address
		 * Prompt user to input gpa and set to variable gpa
		 * Create a new Student object with the input data 
		 */
		for (int i=0; i < count; i++) {
			scnr.nextLine();
			System.out.print("Enter Name:");
			name = scnr.nextLine();
			System.out.print("Enter Address:");
			address = scnr.nextLine();
			System.out.print("Enter GPA:");
			gpa = scnr.nextDouble();
			student = new Student(name, address, gpa);
			linkedlist.add(student);
		}
		/**Try to write the sorted student data to file*/
		try {
			/**Create a FileWriter to write to SortedList.txt*/
			FileWriter fw = new FileWriter("SortedList.txt");
			/**Sort the LinkedList using the StudentNameComparator*/
			Collections.sort(linkedlist, new StudentNameComparator());
			/**Loop through the sorted list and write data to file*/
			for (Student std: linkedlist) {
				fw.write(std.getName() + "," + std.getAddress() + "," + std.getGpa()+"\n");
			}
			/**Close file writer*/
			fw.close();
			/**Catch exceptions that may arise during file writing*/
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}
	
}

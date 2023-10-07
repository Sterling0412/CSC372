import java.util.Comparator;
/**Create class StudentNameComparator that implements the comparator Student class*/
public class StudentNameComparator implements Comparator<Student> {
@Override
/**Compare the names of two student*/
public int compare(Student stud1, Student stud2) {
	return stud1.getName().compareTo(stud2.getName());
}
}

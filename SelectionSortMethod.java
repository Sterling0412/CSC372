import java.util.ArrayList;
import java.util.Comparator;
/**Create a class named SelectionSortMethod*/
public class SelectionSortMethod {
/**Define method named sort that takes two parameters:
 * 
 * @param <T>
 * @param list
 * @param comparator
 */
	public static <T> void sort(ArrayList<T> list, Comparator<? super T> comparator) {
	/**Get the size of the list and store it in n
	 * Start a loop i from 0 to n-1
	 * Initialize minIndex to i
	 * Start another loop j for i+1 to n
	 * Compare the elements at index j and minIndex in the list using the comparator
	 */
		int n = list.size();
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				//If the result is less than 0 update minIndex to j(smallest value)
				//Swap elements at index minIndex and i in the list to move the smallest element to its correct position
				if (comparator.compare(list.get(j),  list.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			T temp = list.get(minIndex);
			list.set(minIndex, list.get(i));
			list.set(i, temp);
		
		}

	}

}

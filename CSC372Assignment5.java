import java.util.Scanner;
/**Create class CSC372Assignment5*/
public class CSC372Assignment5 {
/**Create recursive method sum that takes two parameters
 * 
 * @param userNum
 * @param j
 * @return
 */
	public static int sum (int[] userNum, int j) {
	/**If j >0, then
	 * Return the sum of userNum[j-1] and the result of the recursive call to sum with parameters userNum and j-1
	 * Otherwise when j is 0
	 * Return 0
	 */
		if (j>0)
		{
			return(userNum[j-1] + sum(userNum, j-1));
			
		}
		else
		{
			return 0;
		}
	}
	/**Define main method*/
	public static void main(String[] args) {
		/**Create an integer array userNum with size of 6
		 * Print "Enter Five Numbers:"
		 * Initialize loop i
		 * Calculate the total by calling sum method with userNum and 6 as parameters
		 * store result in total
		 * Print the Sum of the Numbers 
		 */
		int [] userNum = new int[6];
		System.out.println("Enter Five Numbers: ");
		for(int i = 1; i <=5; i++)
		{
			/**Create scanner object
			 * Read integer from user and store in userNum[i]*/
			Scanner scnr = new Scanner(System.in);
			userNum[i] = scnr.nextInt();
		}
		int total = sum(userNum,6);
		System.out.println("Sum of Numbers: " + total);
		
	}

}

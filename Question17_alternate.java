package Week44;

import java.util.Scanner;

public class Question17_alternate {

	/*create methods min() and max()
	 * pass arrays into methods 
	 * to find the minimum vale and maximum values respectively of the elements passed in arrays.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//User enters the array size
		System.out.println("Enter the size of the array that is to be created: ");
		int size = sc.nextInt();
		
		// initialize an array
		int[] myArray = new int[size];
		
		//User inputs the array elements
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i <size; i++) {
			myArray[i]= sc.nextInt();
		}
		sc.close();
		
		
		// method for finding minimum value in the entered array ----arguments are passed in method
		min(myArray);
		System.out.println("Minimum value in the entered array is: " +min(myArray));
		//method for finding maximum value in the entered array
		max(myArray);
		System.out.println("Minimum value in the entered array is: " +max(myArray));

	}
	
	//min method ----pass parameters to the method
	public static int min(int[] array) {
		int min = array[0];
		
		for(int i=0; i <array.length ; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
		
	}
	
	// max method
	public static int max(int[] array) {
		int max = array[0];
		
		for ( int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	

}

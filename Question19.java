package Week44;

import java.util.Scanner;

public class Question19 {
	/*
	 * Write a java program. 
	 * Within your program, you should instantiate an array of integers of length 10 
	 * and assign values to its elements. 
	 * After that, you should use a for loop and print all the numbers
	 *  that are greater or equal to 10.
	 */
	public static void main(String[] args) {
		
		// declare array
		int[] intArray = new int[10];
		
		Scanner in = new Scanner(System.in);
		// initialize the array with values
		//user inputs
		System.out.println("Enter 10 integer values for the array elements: ");
		for (int i = 0; i <10; i++) {
			intArray[i] = in.nextInt();
		}
		in.close();
		
		// print numbers that are greater or equal to 10
		System.out.println("Numbers that are greater or equal to 10 are: ");
		for( int j=0; j <intArray.length; j++) {
			if(intArray[j] >=10) {
				System.out.println(intArray[j] );
			}
		}
		
	}

}

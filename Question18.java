package Week44;

public class Question18 {

	/*
	 * Write a java program. 
	 * Within your program, you should instantiate an array of integers of length 10 
	 * and assign values to its elements. 
	 * After that, you should use a do-while loop 
	 * and find out which is the smallest value stored in your array. 
	 * Print the smallest value.
	 * 
	 */
	public static void main(String[] args) {
		//int[] myArray = new int[10];
		
		int[] myArray = {122,34,11,66,87,89,90,17,65,42};
		
		int smallest = Integer.MAX_VALUE;
		int i=0;
		do {
			
			if(smallest > myArray[i]) {
				smallest = myArray[i];
			}
			
			i++;
		}while(i < myArray.length);

		System.out.println("Smallest value in the array of given elements is: "+ smallest);
	}

}

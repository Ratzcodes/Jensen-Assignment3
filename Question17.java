package Week44;

public class Question17 {

	/* 
	 * Write a java program.
	 *  Within your program, you should instantiate an array of integers of length 10 
	 *  and assign values to its elements. 
	 *  After that, you should use a while loop 
	 *  and find out which is the greatest value stored in your array. 
	 *  Print the greatest value.
	 */
	public static void main(String[] args) {
		
		//Integer[] numbers = new Integer[10];
		//int num[] = {12,14,55,67,92,89,32,44,113,102}; ----can also be written like this
		int[] num = {12,14,55,67,92,89,32,44,113,102};
		
		
		//int greatest=Integer.MIN_VALUE;
		int greatest=0;
		int i=0;
		while(i < num.length) {
			if(greatest  < num[i]) {
			greatest = num[i];
			}
			i++;
		}
		System.out.println("Greatest number in given array of numbers is: " +greatest);
		

	}
	

}

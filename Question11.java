package Week44;

public class Question11 {

	/*
	 * Create the pseudo-code and a java program using the while statement: 
	 * The program should print the sum and the average of first 20 natural numbers, 
	 * i.e. 1,2,3,4…20.
	 */
	
	/*Pseudo-code
	 * 
	 * create a variable of type integer and assign it to 1. 
	 * create variables  for sum and average and assign the value as 0
	 * use the while loop for iteration
	 *and calculate the sum and average inside the while loop 
	 * increment the numbers
	 * print the sum and average
	 */
	public static void main(String[] args) {
		
		int sum =0;
		int count =20;
		double avg=0;
		int num = 1;
		while(num <= count) {
			
			sum += num;
			
			avg =sum/count;
			
			num++;
		}
		System.out.println("Sum of first " + count +" natural numbers is: " +sum);
		
		System.out.println("Average of first  "+count+" natural numbers is: " +avg);
	}

}

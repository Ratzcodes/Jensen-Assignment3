package Week44;

public class Question13 {

	/*
	 * Create a pseudo-code and a java program using the for statement.
	 * The program should print the sum of the values that are divisible by 7 between 0 and 50.
	 */
	
	/*
	 * use for loop for iterating between 0 -50
	 * sum = 0
	 * if number % 7 ==0, then sum = sum + number
	 * print sum
	 */
	public static void main(String[] args) {

		int sum =0;
		for ( int i=0; i <=50; i++) {
			
			if( i % 7 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of the values that are divisible by 7 between 0 and 50 is: " +sum);
	}

}

package Week44;

public class Question8 {

	/*
	 * Create a pseudo-code and a java program using the while loop. 
	 * The program will iterate from 0 to 20. 
	 * For each iteration, it will check if the current number is even or odd,
	 * and report that to the screen (e.g. "2 is even").
	 */
	
	/*Pseudo-code
	 * declare a variable number of type integer
	 * assign it to 0
	 * while( number is less than 20 ),
	 * use if condition, number % 2 gives remainder as 0
	 * then print number is even
	 * else
	 * print number is odd
	 * increment the number and repeat
	 * 
	 */
	public static void main(String[] args) {
		int num = 0;
		
		while ( num  <=20) {
			
			if(num%2 == 0) {
				System.out.println(num + " is even.");
			}else {
				System.out.println(num + " is odd.");
			}
			
			num++;
		}

	}

}

package Week44;

public class Question9 {

	/*
	 * Create a pseudo-code and a java program using the do-while loop. 
	 * The program will iterate from 0 to 20. 
	 * For each iteration, it will check if the current number is even or odd, 
	 * and report that to the screen (e.g. "2 is even").
	 */
	
	/*Pseudo-code
	 * 
	 * declare a variable, number of type integer
	 *use the do while loop to print and iterate the task
	 * Use if condition for the task : if number%2 = 0, number is even
	 * else number is odd
	 * increment the number
	 *check the condition if number  <=20 and loop back/ iterate
	 */
	public static void main(String[] args) {
		int number = 0;
		do {
			if(number%2 == 0) {
				System.out.println(number + " is even.");
			}else {
				System.out.println(number + " is odd.");
			}
			
			number++;
		}while(number <=20);

	}

}

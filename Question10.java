package Week44;

public class Question10 {
	
	/* Create a pseudo-code and a java program using the for loop. 
	 * The program will iterate from 0 to 10. 
	 * For each iteration of the for loop, it will multiply the number by 9 
	 * and print the result*/

	/*Pseudo-code
	 * declare product variable of type integer
	 * use a for loop to iterate from 0 to 10
	 * declare number in for statement
	 * product = number*9
	 * output product
	 * 
	 */
	public static void main(String[] args) {
		
		int product;
		for( int i=0; i <=10; i++) {
			product = i*9;
			System.out.println(product);
		}

	}

}

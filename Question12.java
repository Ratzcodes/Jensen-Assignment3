package Week44;

public class Question12 {
	/*Create a pseudo-code and a java program using the for statement. 
	 * The program should print the sum of the values that are even between 0 and 50.
	 * 
	 */
	
	/* 
	 * initialize variable sum as zero
	 * for ( int number=0; number  <=50; number++)	
	 * if ( number%2 ==0)
	 * sum +=number;
	 * print sum
	 */
	public static void main(String[] args) {
		
		int sum = 0;
		
		for ( int num=0; num <=50; num++) {
			
			if( num%2 == 0) {
				sum += num;
			}
		}
		System.out.println("Sum of even numbers between 0 and 50 is : " +sum);
	}

}

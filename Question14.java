package Week44;

public class Question14 {

	/*
	 * Create a pseudo-code and a java program using a do-while statement. 
	 * The program should print the sum of the squares of the values 
	 * that are odd between 0 and 10, i.e. 1*1+3*3+…+9*9.
	 */
	
	/*Pseudo-code
	 * initialize variable sum =0
	 * use do while loop for iteration between 0 and 10
	 * filter the odd numbers : if( number %2!= 0)
	 * sum = sum + (number*number)
	 * print sum
	 * 
	 */
	public static void main(String[] args) {
		int count = 10;
		int sum = 0;
		
		int num= 0;
		do {
			if(num%2 != 0) {
				sum = sum + (num*num);
			}
			num++;
		} while( num <= count);
		System.out.println("Sum of the squares of the odd numbers between 0 and " +count+" is: " +sum);

	}

}

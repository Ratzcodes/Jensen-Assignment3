package Week44;

public class Question7 {

	/* Create a pseudo-code and a java program using the for loop.
	The program will iterate from 0 to 20. For each iteration, 
	it will check if the current number is even or odd, 
	and report that to the screen (e.g. "2 is even").
	*/
	
	/* Pseudo-code
	 * Define a for loop to iterate from 0 - 20
	 * use if statement inside for loop
	 * if num%2 == 0 , number is even, print "number is even"
	 * else , number is odd , print "number is odd"
	 */
	
	public static void main(String[] args) {


		for (  int i=0; i <=20; i++) {
			if(i%2 == 0) {
				System.out.println(i + " is even.");
			}else {
				System.out.println(i + " is odd.");
			}
		}

	}

}

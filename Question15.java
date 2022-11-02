package Week44;

public class Question15 {
	/* 
	 * Write a java program. 
	 * Within your program, you should instantiate an array of strings of length 5, 
	 * assign five different names to its elements 
	 * and use the for loop to print the elements.
	 */
	public static void main(String[] args) {

		String[] name = new String[5];
		name[0] = "Rahul";
		name[1] = "Sonya";
		name[2] = "Ashish";
		name[3] = "Sachin";
		name[4] = "Virat";
		
		System.out.println("Names in the array of strings is: ");
		for(  int i=0; i <name.length; i++) {
			System.out.println(name[i]);
		}

	}

}

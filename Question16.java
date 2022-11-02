package Week44;
 /* 
  * Write a java program.
  *  Within your program you should instantiate an array of double of length 3 
  *  and assign three different grades to it. 
  *  After that, you should calculate the average of the grades 
  *  and print whether a student cleared a course or not. (Hint: Use the pass grade to be 6!)
  */
public class Question16 {

	public static void main(String[] args) {
		Double[] grade = new Double[3];
		double average;
		grade[0] = (double) 5;
		grade[1] = (double) 5;
		grade[2] = (double) 4;
		
		double sum = 0;
		int count = 3;
		for( int i=0; i <grade.length; i++) {
			sum = sum + grade[i];
		}
		average = sum/count;
		
		System.out.println(average);
		
		if(average>= 6) {
			System.out.println("Student has cleared the course.");
		}else {
			System.out.println("Student has not cleared the course.");
		}

	}

}

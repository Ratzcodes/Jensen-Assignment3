package Week44;


public class reverseArray {

	public static void main(String[] args) {


		int[] myArray = {23,45,21,12,78};
		
	/*	int[] result = new int[myArray.length];
		
		System.out.println("Reverse array is: ");
		for(int i = myArray.length-1; i >=0; i--) {
			
			result[myArray.length-1-i] = myArray[i];
		}
			
		for( int num : result) {
			System.out.println(num);
		}
		*/
		
		System.out.println("Original array: ");
		for( int i = 0; i <myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		System.out.println("Reverse array: ");
		for( int i = myArray.length-1; i >=0; i--) {
			System.out.println(myArray[i]);
		}
		
	}

}

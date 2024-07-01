package practiceDSAapc;

public class Array_Reverse_Program {

	public static void main(String[] args) {
		System.out.println("Reverse an Array Program");

		int myArray[] = { 1, 2, 3, 4 };
		
		reverseAnArray(myArray);
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		

	}

	private static void reverseAnArray(int[] myArray) {
		int firstElement = 0, lastElement = myArray.length-1;
		
		while (firstElement < lastElement) {
			int temp=0;
			temp = myArray[lastElement];
			myArray[lastElement] = myArray[firstElement];
			myArray[firstElement] = temp;
			
			firstElement++;
			lastElement--;
			
		}
		
	}

}

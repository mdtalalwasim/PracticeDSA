package practiceDSAapc.ArrayProgram;

import java.util.Iterator;

public class Array_Deletion_Operation_Array {

	public static void main(String[] args) {

		// int myArray[] = {1,2,3,4,5};
		int myArray[] = new int[3];
		int n = myArray.length;

		System.out.println("Before Deletion Array Is:");
		for (int i = 0; i < n; i++) {
			myArray[i] = i + 1;
			System.out.println("myArray [" + i + "] = " + myArray[i]);
		}
		
		for (int i = 1; i < n - 1; i++) {
			myArray[i] = myArray[i + 1];
			n = n - 1;
		}
		
		System.out.println("After Deletion Array Is:");
		for (int i = 0; i < n; i++) {
			System.out.println("myArray [" + i + "] = " + myArray[i]);
		}

	}

}

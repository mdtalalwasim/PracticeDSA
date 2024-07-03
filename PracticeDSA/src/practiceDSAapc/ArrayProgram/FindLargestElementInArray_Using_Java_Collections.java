package practiceDSAapc.ArrayProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLargestElementInArray_Using_Java_Collections {

	public static void main(String[] args) {
		System.out.println("Find Largest Element: Using Java Collections max() method:");

		// Declaring array
		int myArray[] = { 10, 20, 30, 40, 50, 60, 500 };

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < myArray.length; i++) {
			list.add(myArray[i]);
		}
		System.out.println("Largest Element in the array : " + Collections.max(list));

	}

}

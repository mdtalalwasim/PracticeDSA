package practiceDSAapc.ArrayProgram;

import java.util.Arrays;

public class FindLargestElementInArray_Using_Predefind_sort_Function {

	//if using external function
	static void findLargest(int[] myArray) {
		Arrays.sort(myArray);
	}

	public static void main(String[] args) {
		System.out.println("Using Predefind sort Function: Find the largest element in array:");

		int myArray[] = { 1, 10, 20, 5, 23, 50, 60, 45, 8 };
		
		//findLargest(myArray);
		Arrays.sort(myArray);//sorted in : ascending order
		System.out.println("Largest Element: "+myArray[myArray.length-1]);

	}

}

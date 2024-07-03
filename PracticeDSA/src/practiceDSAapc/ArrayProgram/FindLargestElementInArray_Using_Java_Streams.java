package practiceDSAapc.ArrayProgram;

import java.util.Arrays;

public class FindLargestElementInArray_Using_Java_Streams {

	public static void main(String[] args) {
		System.out.println("Find Largest Using Java Stream:");

		int myArray[] = { 10, 20, 30, 4, 60, 90 };
		
		int maxElement = Arrays.stream(myArray).max().getAsInt();
		System.out.println("Largest Element is :"+maxElement);

	}

}

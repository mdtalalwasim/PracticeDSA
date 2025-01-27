package practiceDSAapc.ArrayProgram;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindLargestElementInArray_Using_Java_Streams {

	public static void main(String[] args) {
		System.out.println("Find Largest Using Java Stream:");

		int myArray[] = { 10, 20, 30, 4, 60, 90 };
		
		int maxElement = Arrays.stream(myArray).max().getAsInt();
		System.out.println("Largest Element is :"+maxElement);
		
		int minElement = Arrays.stream(myArray).min().getAsInt();
		System.out.println("Smallest Element is :"+minElement);
		
		int m = Arrays.stream(myArray).sum();
		System.out.println("Sum of all Elements :"+m);
		
		int findFirst = Arrays.stream(myArray).findFirst().getAsInt();
		System.out.println("Find First Element of a given Array :"+findFirst);
		
		

	}

}

package practiceDSAapc.ArrayProgram;

public class FindLargestElementInArray_IterativeWay {

	static int myArray[] = { 10, 20, 30, 5, 50, 500 };

	static int findLargest() {

		int max = myArray[0]; // let the 0th position value is max;

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}

		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Find Largest Element of an Array: Iterative way | Brute Force Method");

		System.out.println("The Largest Element of the given array is : " + findLargest());

	}

}

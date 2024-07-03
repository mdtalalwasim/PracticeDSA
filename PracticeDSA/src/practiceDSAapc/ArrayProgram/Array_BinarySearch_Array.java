package practiceDSAapc.ArrayProgram;

public class Array_BinarySearch_Array {

	public static void main(String[] args) {
		System.out.println("Binary Search Program...");
		int myArray[] = { 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };

		int key = 28;

		int result = binarySearchPerform(myArray, key);

		if (result == -1) {
			System.out.println(key + " Not Found");
		} else {
			System.out.println("Key: " + key + ", Found at: " + result);
		}

	}

	private static int binarySearchPerform(int[] myArray, int key) {
		int start = 0;
		int end = myArray.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (myArray[mid] == key) {
				return mid;
			}
			if (mid < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}

}

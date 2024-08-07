package practiceDSAapc.ArrayProgram;

public class Array_Linear_Search_Program {

	private static int linearSearch(int[] numbers, int key) {

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 5, 7, 10 };
		int key = 10;

		int index = linearSearch(numbers, key);

		if (index == -1) {
			System.out.println("Not Found!");
		} else {
			System.out.println("Key / Element = "+key+" , found at position/index :" + index);
		}
	}

}

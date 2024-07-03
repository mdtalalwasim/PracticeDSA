package practiceDSAapc.ArrayProgram;

public class Array_Find_Largest_Elemnet_Array {

	public static int getLargest(int numbers[]) {
		int largestNumber = Integer.MIN_VALUE; // -infinity value
		
		int smallestNumber = Integer.MAX_VALUE;

		int count=0;
		for (int i = 0; i < numbers.length; i++) {
			if (largestNumber < numbers[i]) {
				largestNumber = numbers[i];

			}
			
			if (smallestNumber > numbers[i]) {
				smallestNumber = numbers[i];
				count++;
			}
		}
		System.out.println("smallest Value :"+smallestNumber);
		return largestNumber;
	}

	public static void main(String[] args) {
		System.out.println("Find Largest Number in Given Array");

		int numbers[] = { 1, 2, 6, 3, 5, 50 };
		System.out.println("largest value is : " + getLargest(numbers));
	}

}

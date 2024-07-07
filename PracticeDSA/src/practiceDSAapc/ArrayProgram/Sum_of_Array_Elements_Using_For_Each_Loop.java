package practiceDSAapc.ArrayProgram;

public class Sum_of_Array_Elements_Using_For_Each_Loop {

	public static void main(String[] args) {

		int myArray[] = { 10, 20, 30, 40, 50, 60, 70 };
		int sum = 0;
		
		for (int i : myArray) {
			sum = sum+i;
		}
		System.out.println("Sum ="+sum);
		

	}

}

package practiceDSAapc.ArrayProgram;

import java.util.Arrays;

public class Array_Insertion_Operation_Array {

	public static void main(String[] args) {
		
		//creating an int type array of size 5.
		int myArray[] = new int[5];
		System.out.println("Before Insert Element into Array:: Array is Empty:");
		for(int i=0; i<5; i++) {
			//print empty array
			System.out.println("myArray ["+ i +"] = "+myArray[i]);
		}
		System.out.println("Going to Insert Elements into myArray:");
		for(int i=0; i<5; i++) {
			myArray[i]= i+1;
			System.out.println("myArray ["+i+"] = "+myArray[i]);
		}
	
		System.out.println("Final Array Look Like :"+Arrays.toString(myArray));
		
		

	}

}

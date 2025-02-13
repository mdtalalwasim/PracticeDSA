package practiceDSAapc.ArrayProgram;

import java.util.Arrays;


public class RemoveElementOfAnArray {
	
	
	public static void main(String args[] ) {
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Before : "+Arrays.toString(arr));
		int pos=2;
		for(int i= pos; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
			
		}
		System.out.println("After : "+Arrays.toString(arr));  
	}

}

package practiceDSAapc;

public class Array_Search_Operation_in_Array {

	public static void main(String[] args) {

		// Perform a Search Operation in Given Array.

		//int myArray[] = { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		
		//declare array
		int myArray[] = new int[11];
		int valueForSearch = 40;
		
		//assign value dynamically into array
		System.out.println("After assigning value into array: ");
		for(int i=0; i<myArray.length; i++) { 
			myArray[i] = i*5;
			System.out.println("myArray["+i+"]="+myArray[i]);
		}
		
		boolean found =false;
		for (int i = 0; i <myArray.length; i++) {
			if(myArray[i] == valueForSearch) {
				System.out.println("Found: "+valueForSearch+" at index: "+i);
				found = true;//if found 
				break;
			}
		}
		
		//IF not found the key in Array
		if(!found) {
			System.out.println(valueForSearch+" NOT FOUND in the given array");
		}
		
		

	}

}

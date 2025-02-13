package practiceDSAapc.ArrayMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayMethodsPrograms {

	public static void main(String[] args) {

		// Method #01: asList() example
		// works with object array
		Integer[] array = { 1, 4, 7, 10, 13 };
		List<Integer> asList = Arrays.asList(array);
		System.out.println("Original Array is " + asList);
		System.out.println("Original Array is " + Arrays.asList(array));

		System.out.println("-----------------------------------------------------");

		// working with primitive type
		int[] nums = { 1, 4, 7, 10, 13 };
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		System.out.println("Convert Primitive Array to Object Type List:" + list);
		System.out.println("-----------------------------------------------------");

		List<String> list2 = Arrays.asList("Apple", "Banana", "Cherry");
		System.out.println("Original :" + list2);
		list2.set(2, "Orange");
		System.out.println("Modified :" + list2);
		System.out.println("-----------------------------------------------------");

		// Method #02: binarySearch()
		System.out.println("--------------------binarySearch()---------------------------------");
		int keySearch = 10;
		int index = Arrays.binarySearch(nums, keySearch);
		System.out.println("Orginal Array is : " + Arrays.toString(nums));
		System.out.println("Index of " + keySearch + ": " + index);
		System.out.println("-----------------------------------------------------");

		// Method #03: copyOf(originalArray, newLength)
		System.out.println("--------------------copyOf(originalArray, newLength) ---------------------------------");
		int[] arrayOriginal = { 2, 4, 6 };
		System.out.println("Original Array is :" + Arrays.toString(arrayOriginal));
		int newLength = 4;
		int[] copyArray = Arrays.copyOf(arrayOriginal, newLength);
		System.out.println("New Array is :" + Arrays.toString(copyArray));

		// Method #04: equals(array1, array2)
		System.out.println("--------------------equals(array1, array2)  ---------------------------------");
		int[] a1 = { 2, 4, 6 };
		int[] a2 = { 2, 4, 6, 8 };
		System.out.println("Original Array is :" + Arrays.toString(arrayOriginal));
		boolean equals = Arrays.equals(a1, a2);
		System.out.println("Array is Equal? :" + equals);

		// Method #05: fill(originalArray, fillValue)
		System.out.println("--------------------fill(originalArray, fillValue)---------------------------------");
		int[] fillArray = { 2, 4, 6 };
		int fillValue = 5;
		System.out.println("Original Array is :" + Arrays.toString(fillArray));
		Arrays.fill(fillArray, fillValue);
		System.out.println("Array after fill :" + Arrays.toString(fillArray));

		// Method #06: parallelSort(unsortedArray)
		System.out.println("--------------------parallelSort(unsortedArray) --> sort the array using merger sort algorithm---------------------------------");
		int[] unsortedArray = { 60, 20, 4, 80 };
		System.out.println("Original Array is :" + Arrays.toString(unsortedArray));
		Arrays.parallelSort(unsortedArray);
		System.out.println("Array after parallersort sorting :" + Arrays.toString(unsortedArray));
		
		

	}

}

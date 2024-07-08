package practiceDSAapc.Patterns;

import java.util.Scanner;

public class Pattern_01 {

/**
Pattern Output:
		 
For this patter: insert value : 4		 
 * * * *
 * * * *
 * * * *
 * * * *
	
**/
	
	//with function:
	static void printPattern1(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//without function: Inside only main function:
		
		
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		/*for(int i=0; i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert value for N:");
		int n = sc.nextInt();
		
		//call function:
		printPattern1(n);
	
	}

}

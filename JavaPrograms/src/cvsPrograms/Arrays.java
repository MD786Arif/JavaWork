package cvsPrograms;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		one dimensional Array

/*		System.out.println("Enter the size of array ");
		int n = sc.nextInt();
		int arr[] = new int[n]; // dynamically declaring the size of variable 
//		int arr[] = {12,45,78,89,90};
		System.out.println("Enter the array :-) ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int item : arr) {
			System.out.print(item + " ");
		}        */
		
		
//	           Multi dimensional array
	/*	int rows,cols;
		System.out.println("Enter the number of rows ");
		 rows = sc.nextInt();
		 System.out.println("Enter the number of cols ");
		 cols = sc.nextInt();
		 System.out.println("Enter the elements of arr");
		int arr[][] = new int[rows][cols];
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The entered arr");
		
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	*/
		 
		sc.close();  
		
//		We can also decclare the 2d array 
		int arr[][] = {{1,2,3,4},{78,9,12,34},{1,4,5,6}};
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}

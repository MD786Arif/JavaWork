package cvsPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void prime(){
		int s = 0;
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		int n = sc.nextInt();
		System.out.print("Enter the ending number : ");
		int  m = sc.nextInt();
		int count;
		for(int i = n;i<=m;i++){
			count = 0;
			for(int j = 1;j<=i;j++){
				if(i%j==0){
					count = count+1;
				}
			}
			if(count==2){
				s = s+1;
			}
		}
		System.out.println("The total number of primes between "+n +" and "+m+" is "+s);
	}


	public static void main(String[] args) {
//	    prim number 
//		Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number ");
//		int n = sc.nextInt();
//		boolean result = true;
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				result = false;
//				break;
//			} else {
//				result = true;
//			}
//		}
//
//		System.out.println("Is Prime ? " + result);

		prime();

	}

}

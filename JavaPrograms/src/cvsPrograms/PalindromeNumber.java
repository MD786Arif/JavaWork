package cvsPrograms;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
	
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();
		int reversedNumber =0;
		int temp = n;
		while(temp>0) {
			int remainder = temp%10;
			temp/=10;
			reversedNumber = reversedNumber*10+remainder;	
		}
		if(reversedNumber==n) {
			System.out.println("The number is palindrome");
			
		}else {
			System.out.println("The number is not a palindrome");
			
		}
		
		

	}

}

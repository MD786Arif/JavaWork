package cvsPrograms;

import java.util.Scanner;

public class ReverseNumber {
	static void reversedNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int reversedNumber = 0;
		sc.close();
		int temp = n;
		while (temp > 0) {
			int lastDigit = temp % 10;
			temp = temp / 10;
			reversedNumber = reversedNumber * 10 + lastDigit;

		}

		System.out.println("The revesed Number is :- " + reversedNumber);

	}

	public static void main(String[] args) {

		reversedNumber();

	}

}

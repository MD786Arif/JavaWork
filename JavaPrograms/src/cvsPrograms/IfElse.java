package cvsPrograms;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.println("Enter the money inhand :- ");
		money = sc.nextInt();

		if (money > 4000) {
			System.out.println("Go to ambiance mall ");
		} else if (money < 4000 && money > 2000) {
			System.out.println("Go to Arif mall");
		} else {
			System.out.println("Go to sadar bazar ");
		}

		sc.close();
	}

}

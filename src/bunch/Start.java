package bunch;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even");

		} else {
			System.out.println("odd");

		}

	}

}

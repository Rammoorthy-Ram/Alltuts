package com.AllTuts;

import java.util.Scanner;

class ArraysSingle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter the values:");
			a[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + a[i];

		}
		System.out.println(sum);

	}
}
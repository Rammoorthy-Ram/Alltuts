package com.AllTuts;

import java.util.Scanner;

public class RoughForMe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println("2×" + i + "=" + a * i);
		}
	}

}

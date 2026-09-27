package com.AllTuts;

import java.util.Scanner;

public class SwitchCase20prb2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num1:");
		int a = scanner.nextInt();
		System.out.println("Enter num2:");
		int b = scanner.nextInt();
		System.out.println("Select in this one of the operator:+ - * /");
		char operation = scanner.next().charAt(0);
		switch (operation) {
		case '+':
			System.out.println("The addition is:" + (a + b));
			break;
		case '-':
			System.out.println("The subtraction is:" + (a - b));
			break;

		}
		scanner.close();
	}

}

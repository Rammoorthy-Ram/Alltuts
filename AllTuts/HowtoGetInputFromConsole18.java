package com.AllTuts;
import java.util.Scanner;

public class HowtoGetInputFromConsole18 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter you name: ");
		String name = scanner.nextLine();
		System.out.println("Your name is:" + name);
		scanner.close();
	}

}

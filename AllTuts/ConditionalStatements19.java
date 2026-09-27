package com.AllTuts;

import java.util.Scanner;

public class ConditionalStatements19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Day:");
		String day = scanner.nextLine();
		if (day.equals("monday") || day == "tuesday" || day == "wednesday" || day == "thursday" || day == "friday") {
			System.out.println("Uff,its a Week Day");
		} else {
			System.out.println("Yayy,its a Weekend");
		}
		scanner.close();

	}

}

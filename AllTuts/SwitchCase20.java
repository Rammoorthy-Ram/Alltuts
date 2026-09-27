package com.AllTuts;

import java.util.Scanner;

public class SwitchCase20 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Num:");
		int a = scan.nextInt();
		switch (a % 2) { // 10%2=it we gets the reminder is 0 we should assignt the case for the number
							// wise in the boolean formate simply right, whenever it returns 0 in the case 0
							// 0 we should assign the statement for this
		case 0:
			System.out.println("This is Even Number");
			break;
		case 1:
			System.out.println("THis is Odd Number");
			break;
		default:
			System.out.println("This is Invalid Number");
		
		}
		scan.close();

	}

}
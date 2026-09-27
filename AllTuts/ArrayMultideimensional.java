package com.AllTuts;

public class ArrayMultideimensional {
	public static void main(String[] args) {
		int arr[][] = new int[2][4];
		arr[0][0] = 10;
		arr[0][1] = 25;
		arr[0][2] = 30;
		arr[0][3] = 50;

		arr[1][0] = 10;
		arr[1][1] = 20;
		arr[1][2] = 30;
		arr[1][3] = 50;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}

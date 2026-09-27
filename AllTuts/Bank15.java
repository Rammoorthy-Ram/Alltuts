
package com.AllTuts;

public class Bank15 {
	// greetings
	// currentBalance
	// Deposit
	// Withdraw
	// getCurrentBalance

	static int currentBalance = 1000;

	public static void greetCustomer() {
		System.err.println("Hello welcome to the Banking");
	}

	public void deposite(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("The deposited amount is :" + amount);
		System.out.println("Amount deposited Successfully");
		System.err.println("Total Balance is: " + currentBalance);
	}

	public static void withdraw(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("The Withdrawn successfully");
		System.out.println("Withdrawn succeessfully: " + currentBalance);
	}

	public int getCurrentBalance() {
		return currentBalance; // whenever we are going to return the value we should declare the type of the
	}

	public static void main(String args[]) {
		System.out.println("This is the your CurrentBalance:" + currentBalance);
		greetCustomer();
		Bank15 bank = new Bank15();
		bank.deposite(3200);
		withdraw(600);
		withdraw(600);
		withdraw(600);
		System.err.println("The current Balance is: " + bank.getCurrentBalance()); // to print on the console

	}
}
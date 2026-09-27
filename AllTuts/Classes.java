package com.AllTuts;

class Classes {
	// class is a blueprint which contains variables and methods information is
	String name;
	int age;
	int salary;

	public static void main(String args[]) {
		// creating an object of the Classes class
		Classes c1 = new Classes();

		// Assigning values to the object
		c1.name = "Ram moorthy";
		c1.age = 20;
		c1.salary = 35000;

		// Accessing the object data
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);

	}
	
}
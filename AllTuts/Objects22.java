package com.AllTuts;

public class Objects22 {
	int a;
	int b;

	public Objects22() {
		a = 10;
		b = 20;
	}

	public Objects22(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public static void main(String[] args) {
		Objects22 o1 = new Objects22();
		Objects22 o2 = new Objects22(20, 64);
		Objects22 o3 = new Objects22(65, 89);
		System.out.println(o1.add());
		System.out.println(o2.add());
		System.err.println(o3.add());
	}

}

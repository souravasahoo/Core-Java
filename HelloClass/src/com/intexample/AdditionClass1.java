package com.intexample;

public class AdditionClass1 {
	int a;
	int b;

	public void add() {
		int c = a + b;
		System.out.println("Results : " + c);
	}

	public static void main(String[] args) {
		AdditionClass1 srv = new AdditionClass1();

		srv.a = 25;
		srv.b = 45;
		srv.add();

	}

}

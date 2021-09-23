package com.doubleexample;

public class AdditionClass {
	double a = 767877.665d;
	double b = 76578.6876d;

	public void add() {
		double sum = a + b;
		System.out.println("Sum of Two Number : " + sum);
	}

	public static void main(String[] args) {
		AdditionClass srv = new AdditionClass();
		srv.add();
	}

}

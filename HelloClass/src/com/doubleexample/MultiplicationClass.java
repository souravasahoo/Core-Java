package com.doubleexample;

public class MultiplicationClass {
	double a = 746.747d;
	double b = 674.356d;

	public void multi() {
		double c = a * b;
		System.out.println("Multiplication Of Two Number : " + c);
	}

	public static void main(String[] args) {
		MultiplicationClass srv = new MultiplicationClass();
		srv.multi();

	}

}

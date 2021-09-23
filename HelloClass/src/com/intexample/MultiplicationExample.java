package com.intexample;

public class MultiplicationExample {
	int firstnumber = 43;
	int secondnumber = 89;

	public void multi() {
		int result = firstnumber * secondnumber;
		System.out.println("Multiplication of two number : " + result);
	}

	public static void main(String[] args) {
		MultiplicationExample a = new MultiplicationExample();
		a.multi();

	}
}

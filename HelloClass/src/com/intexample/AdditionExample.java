package com.intexample;

public class AdditionExample {
	int firstnumber = 67;
	int secondnumber = 87;

	public void add() {
		int sum = firstnumber + secondnumber;
		System.out.println("Sum of Two Number : " + sum);
	}

	public static void main(String[] args) {
		AdditionExample a = new AdditionExample();
		a.add();

	}

}

package com.floatexample;

public class AdditionExample {
	float num1 = 786.876f;
	float num2 = 565f;

	public void Add() {
		float sum = num1 + num2;
		System.out.println("Addition of two Number :" + sum);

	}

	public static void main(String[] args) {

		AdditionExample a = new AdditionExample();
		a.Add();

	}

}

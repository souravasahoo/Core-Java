package com.floatexample;

public class MultiExample {
	float num1 = 7666.78f;
	float num2 = 655.7655f;

	public void multi() {
		float res = num1 * num2;
		System.out.println("Multiplication of Two Number : " + res);
	}

	public static void main(String[] args) {
		MultiExample a = new MultiExample();
		a.multi();
	}

}

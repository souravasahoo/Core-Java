package com.floatexample;

import java.nio.charset.MalformedInputException;

public class DivisionClass {
	float num1 = 8787.688f;
	float num2 = 6678.79998f;

	public void div() {
		float res = num1 / num2;
		System.out.println("Division Result : " + res);
	}

	public static void main(String[] args) {
		DivisionClass a = new DivisionClass();
		a.div();
	}

}

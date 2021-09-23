package com.doubleexample;

public class SubstractionClass {
	double a = 78766.454d;
	double b = 45454.465d;

	public void sub() {
		double c = a - b;
		System.out.println("Substraction Result : " + c);
	}

	public static void main(String[] args) {
		SubstractionClass srv = new SubstractionClass();
		srv.sub();
	}

}

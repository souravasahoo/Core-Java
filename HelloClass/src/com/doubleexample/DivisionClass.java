package com.doubleexample;

public class DivisionClass {
	double a = 8747.747d;
	double b = 4538.8747d;

	public void div() {
		double c = a / b;
		System.out.println("Division Results : " + c);
	}

	public static void main(String[] args) {
		DivisionClass srv = new DivisionClass();
		srv.div();

	}

}

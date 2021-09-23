package com.floatexample;

import java.util.Scanner;

public class DivisionScan {
	float a;
	float b;

	public void div() {
		float c = a / b;
		System.out.println("Division Result :" + c);
	}

	public static void main(String[] args) {
		DivisionScan srv = new DivisionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextFloat();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextFloat();
		srv.div();
	}

}

package com.floatexample;

import java.util.Scanner;

public class MultiplicationScan {
	float a;
	float b;

	public void multi() {
		float c = a * b;
		System.out.println("Multiplication of Two Number : " + c);
	}

	public static void main(String[] args) {
		MultiplicationScan srv = new MultiplicationScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextFloat();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextFloat();
		srv.multi();

	}

}

package com.floatexample;

import java.util.Scanner;

public class SubstractionScan {
	float a;
	float b;

	public void sub() {
		float c = a - b;
		System.out.println("Substraction of Two Number : " + c);
	}

	public static void main(String[] args) {
		SubstractionScan srv = new SubstractionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextFloat();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextFloat();
		srv.sub();
	}
}

package com.floatexample;

import java.util.Scanner;

public class AdditionScan {
	float a;
	float b;

	public void add() {
		float c = a + b;
		System.out.println("Addition of Two Number : " + c);
	}

	public static void main(String[] args) {
		AdditionScan srv = new AdditionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextFloat();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextFloat();
		srv.add();
	}

}

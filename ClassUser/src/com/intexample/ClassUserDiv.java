package com.intexample;

import java.util.Scanner;

public class ClassUserDiv {
	int a;
	int b;

	public void div() {
		int c = a / b;
		System.out.println("Division Results : " + c);
	}

	public static void main(String[] args) {
		ClassUserDiv srv = new ClassUserDiv();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextInt();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextInt();
		srv.div();
		scan.close();
	}
}

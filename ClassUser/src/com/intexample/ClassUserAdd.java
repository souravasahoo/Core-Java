package com.intexample;

import java.util.Scanner;

public class ClassUserAdd {
	int a;
	int b;

	public void add() {
		int c = a + b;
		System.out.println("Addition af Two Number " + c);
	}

	public static void main(String[] args) {
		ClassUserAdd srv = new ClassUserAdd();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number ");
		srv.a = scan.nextInt();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextInt();
		srv.add();
		scan.close();
	}
}

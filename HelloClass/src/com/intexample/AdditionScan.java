package com.intexample;

import java.util.Scanner;

public class AdditionScan {
	int num1;
	int num2;

	public void add() {
		int sum = num1 + num2;
		System.out.println("Addition : " + sum);
	}

	public static void main(String[] args) {
		AdditionScan srv = new AdditionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.num1 = scan.nextInt();
		System.out.println("Enter Second Number : ");
		srv.num2 = scan.nextInt();
		srv.add();
	}

}

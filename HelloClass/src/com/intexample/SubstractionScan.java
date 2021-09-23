package com.intexample;

import java.util.Scanner;

public class SubstractionScan {
	int num1;
	int num2;

	public void subs() {
		int sub = num1 - num2;
		System.out.println("Addition : " + sub);
	}

	public static void main(String[] args) {
		SubstractionScan srv = new SubstractionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.num1 = scan.nextInt();
		System.out.println("Enter Second Number : ");
		srv.num2 = scan.nextInt();
		srv.subs();
	}

}

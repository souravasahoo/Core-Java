package com.longexample;

import java.util.Scanner;

public class ModScan {
	long a;
	long b;

	public void mod() {
		long c = a % b;
		System.out.println("Mod Result : " + c);
	}

	public static void main(String[] args) {
		ModScan srv = new ModScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextLong();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextLong();
		srv.mod();
	}
}

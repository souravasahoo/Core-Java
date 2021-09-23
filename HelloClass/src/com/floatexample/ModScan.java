package com.floatexample;

import java.util.Scanner;

public class ModScan {
	float a;
	float b;

	public void mod() {
		float c = a % b;
		System.out.println("Mod Result : " + c);
	}

	public static void main(String[] args) {
		ModScan srv = new ModScan();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number : ");
		srv.a = scan.nextFloat();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextFloat();
		srv.mod();
	}
}

package com.doubleexample;

import java.util.Scanner;

public class ModScan {
	double a;
	double b;

	public void mod() {
		double c = a % b;
		System.out.println("Mod Results : " + c);
	}

	public static void main(String[] args) {
		ModScan srv = new ModScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextDouble();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextDouble();
		srv.mod();

	}

}

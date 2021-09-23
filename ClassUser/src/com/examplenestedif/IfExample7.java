package com.examplenestedif;

import java.util.Scanner;

public class IfExample7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input Value :");
		Long a = sc.nextLong();

		if (a.equals(10)) {
			System.out.println("Travel Thailand");
		} else if (a.equals(20)) {
			System.out.println("Travel Maldiv");
		} else if (a.equals(30)) {
			System.out.println("Travel Amsterdam");
		} else if (a.equals(40)) {
			System.out.println("Travel LasVegas");
		} else if (a.equals(50)) {
			System.out.println("Travel HongKom");
		} else {
			System.out.println("7 Days Quarantine");
		}
		sc.close();
	}

}

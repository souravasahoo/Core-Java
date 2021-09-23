package com.examplenestedif;

import java.util.Scanner;

public class IfExample8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press A to J for Your Favourite Drink :");
		Character a = sc.next().charAt(0);
		if (a.equals('A')) {
			System.out.println("KingFisher");
		} else if (a.equals('B')) {
			System.out.println("Tuborg");
		} else if (a.equals('C')) {
			System.out.println("BudWeiser");
		} else if (a.equals('D')) {
			System.out.println("BroCode");
		} else if (a.equals('E')) {
			System.out.println("UltraMax");
		} else if (a.equals('F')) {
			System.out.println("Corona");
		} else if (a.equals('G')) {
			System.out.println("CalsBerg");
		} else if (a.equals('H')) {
			System.out.println("HeineKen");
		} else if (a.equals('I')) {
			System.out.println("HoeGarden");
		} else if (a.equals('J')) {
			System.out.println("Haywards_5000");
		} else {
			System.out.println("Go for Whisky");
		}
		sc.close();

	}

}

package com.examplecondition;

import java.util.Scanner;

public class IfExample7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Value Between A to G");
		char x = scan.next().charAt(0);
		if (x == ('A')) {
			System.out.println("Azerbizan");
		}
		if (x == ('B')) {
			System.out.println("Belgium");
		}
		if (x == ('C')) {
			System.out.println("Cambodia");
		}
		if (x == ('D')) {
			System.out.println("Denmark");
		}
		if (x == ('E')) {
			System.out.println("El Salvador");
		}
		scan.close();
	}

}

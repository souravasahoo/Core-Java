package com.practice;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check : ");
		int n = sc.nextInt();
		if ((n % 2) == 0) {
			System.out.println(n + " is a Even Number.");
		} else {
			System.out.println(n + " is a Odd Number. ");
		}
		sc.close();
	}

}

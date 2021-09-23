package com.forexample;

import java.util.Scanner;

public class ForExample7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add Character : ");
		char[] a = sc.next().toCharArray();
		System.out.println("Character Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		sc.close();

	}

}

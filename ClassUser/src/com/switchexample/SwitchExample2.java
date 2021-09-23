package com.switchexample;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Press A to F");
		char x = sc.next().charAt(0);

		switch (x) {
		case 'A': {
			System.out.println("Delhi");
		}
			break;
		case 'B': {
			System.out.println("Kolkata");
		}
			break;
		case 'C': {
			System.out.println("Mumbai");
		}
			break;
		case 'D': {

			System.out.println("Chennai");
		}
			break;
		case 'E': {
			System.out.println("Indore");
		}
			break;
		case 'F': {
			System.out.println("Patna");
		}
			break;
		default: {
			System.out.println("High on Weed");
		}
		sc.close();
		}

	}

}

package com.switchexample;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to 6");
		int x = sc.nextInt();

		switch (x) {
		case 1: {
			System.out.println("Delhi");
		}
			break;
		case 2: {
			System.out.println("Kolkata");
		}
			break;
		case 3: {
			System.out.println("Mumbai");
		}
			break;
		case 4: {

			System.out.println("Chennai");
		}
			break;
		case 5: {
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


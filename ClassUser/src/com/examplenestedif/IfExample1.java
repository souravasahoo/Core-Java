package com.examplenestedif;

public class IfExample1 {
	public static void main(String[] args) {
		int x = 10;

		if (x > 0) {
			System.out.println("X is Greater than 0");
			if (x == 10) {
				System.out.println("X is equal to " +x);
			}
		}

	}

}

package com.practice;

public class ArmstrongExample {

	public static void main(String[] args) {
		int N = 153;
		int t1 = N;
		int length = 0;
		while (t1 != 0) {
			length = length + 1;
			t1 = t1 / 10;
		}
		int t2 = N;
		int arm = 0;
		int rem;
		while (t2 != 0) {
			int mul = 1;
			rem = t2 % 10;
			for (int i = 1; i <= length; i++)

			{
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}
		if (N == arm) {
			System.out.println("Armstrong Number : " + N);
		} else {
			System.out.println(N + " not an Armstrong Number.");
		}

	}

}

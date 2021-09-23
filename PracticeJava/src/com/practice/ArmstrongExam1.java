package com.practice;

import java.util.Scanner;

public class ArmstrongExam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number You Want To Check : ");
		int no = sc.nextInt();
		int length = 0;
		int t1 = no;
		while (t1 != 0) {
			t1 = t1 / 10;
			length++;
		}
		int t2 = no;
		int rem, arm = 0;
		while (t2 != 0) {
			int mul = 1;
			rem = t2 % 10;
			for (int i = 1; i <= length; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}
		if (arm == no) {
			System.out.println(no + " is an Armstrong Number.");
		} else {
			System.out.println(no + " is not am Armstrong Number.");
		}
		sc.close();

	}

}

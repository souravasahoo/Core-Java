package com.examplenestedif;

import java.util.Scanner;

public class IfExample5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input Value : ");
		float x=sc.nextFloat();
		if (x<0) {
			System.out.println("X less than Zero");
		}
		else {
			System.out.println("X greater than Zero");
		}
		sc.close();
	}
	

}

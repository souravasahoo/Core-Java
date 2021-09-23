package com.whileexample;

import java.util.Scanner;

public class WhileExample4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Between 0 to 9");
		int a=sc.nextInt();
		do {
			System.out.println(a);
			a++;
			
		}while(a<10);
		sc.close();

	}

}

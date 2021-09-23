package com.forexample;

import java.util.Scanner;

public class ForExample4 {

	public static void main(String[] args) {
		
		System.out.println("Enter Array Row Size :");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		System.out.println("Enter Array Column Size :");
		int columns = sc.nextInt();
		
		System.out.println("Enter Array Elements : ");
		
		int arr[][] = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array is : ");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println(arr[i][j]);
			}
		}
		sc.close();
	}

}

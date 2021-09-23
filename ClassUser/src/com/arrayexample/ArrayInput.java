package com.arrayexample;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Element you want to Store: ");
		n=sc.nextInt();
		int[] arr=new int[10];
		System.out.println("Enter the Element of Array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}

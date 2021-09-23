package com.arrayexample;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println(arr);
		System.out.println("----------------------------------");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println("Length of Array : " + arr.length);
		System.out.println("------------Using While Loop----------------");
		int i = 0;
		while (i < arr.length) {
			int x = arr[i];
			System.out.println(x);
			i = i + 1;
		}
		System.out.println("-----------Using Do While Loop-----------");
		int j = 0;
		do {
			int x = arr[j];
			System.out.println(x);
			j = j + 1;
		} while (j < arr.length);
		System.out.println("-----------Using For Loop-----------");
		for (int k = 0; k < arr.length; k++) {
			int x = arr[k];
			System.out.println(x);
		}
		System.out.println("-------------Using For Each loop---------------");
		for (int x : arr) {
			System.out.println(x);
		}

	}

}

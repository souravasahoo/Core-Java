package com.forexample;

public class ForExample6 {

	public static void main(String[] args) {
		int[][][] arr = { { { 100, 200 }, { 300, 400 }, { 500, 600 } }, { { 700, 800 }, { 900, 1000 }, { 1100, 1200 } } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}

	}

}

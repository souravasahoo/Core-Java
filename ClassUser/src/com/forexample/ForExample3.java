package com.forexample;

public class ForExample3 {

	public static void main(String[] args) {
		int[][] arr=new int[2][2];
		arr[0][0]=100;
		arr[0][1]=200;
		arr[1][0]=300;
		arr[1][1]=400;
		System.out.println("----------Using For Loop-----------");
		for(int i=0;i<2;i++) {
			for(int k=0;k<2;k++) {
				System.out.println("Array Address :"+i+" "+k);
				System.out.println(arr[i][k]);
			}
		}
	}

}

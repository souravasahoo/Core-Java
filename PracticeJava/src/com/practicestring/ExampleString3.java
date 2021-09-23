package com.practicestring;

public class ExampleString3 {

	public static void main(String[] args) {
		String s1="Sourav";
		String s2="Sahoo";
		String s3="sourav";
		System.out.println(s1.equals(s2)); //boolean:false
		System.out.println(s1.equals(s3)); //boolean:false
		System.out.println(s1.equalsIgnoreCase(s3)); //boolean:true
		System.out.println(s1.equals("")); //boolean:false

	}

}

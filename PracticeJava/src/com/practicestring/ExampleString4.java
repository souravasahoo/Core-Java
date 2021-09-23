package com.practicestring;

public class ExampleString4 {

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "A";

		System.out.println(s1.compareTo(s2)); // int:97-65

		String s3 = "aBc";
		String s4 = "Abc";
		String s5 = "";

		System.out.println(s3.compareTo(s4)); // int

		System.out.println(s3.compareToIgnoreCase(s4)); // int:abc-abc=0

		System.out.println(s3.compareToIgnoreCase(s5));

	}

}

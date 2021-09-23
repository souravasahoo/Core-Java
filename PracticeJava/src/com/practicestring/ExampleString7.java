package com.practicestring;

public class ExampleString7 {

	public static void main(String[] args) {
		// input string
		String s1 = "java string split method by javatpoint";
		System.out.println(s1.startsWith("ja")); // boolean : true
		System.out.println(s1.startsWith("java string")); // boolean : true
		System.out.println(s1.startsWith("Java string")); // boolean : false

	}

}

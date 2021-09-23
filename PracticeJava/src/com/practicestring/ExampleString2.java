package com.practicestring;

public class ExampleString2 {

	public static void main(String[] args) {
		String name1 = "    Hello";
		String name2 = "   Sourav    Sahoo    ";
		String name3 = "";
		System.out.println(name1);
		System.out.println(name1.trim());
		System.out.println(name2);
		System.out.println(name2.trim());
		if (name3.trim().length() == 0) {
			System.out.println("Name is Empty");
		} else {
			System.out.println("Valid Name");
		}
	}

}

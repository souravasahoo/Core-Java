package com.practicestring;

public class ExampleString5 {

	public static void main(String[] args) {
		String s1 = "Abdul";
		String s2 = "Kalam";
		System.out.println(s1 + s2);
		System.out.println(s1 + 10);
		System.out.println(s1 + 10 + 20);
		System.out.println(10 + 20 + s2);
		System.out.println(10 + s2 + 20);
		System.out.println(s1 + 20 / 10); // preference
		// System.out.println(s1+10-20); //Error
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.concat(" Rahim"));
	}

}

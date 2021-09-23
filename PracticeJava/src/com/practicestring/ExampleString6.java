package com.practicestring;

public class ExampleString6 {
	public static void main(String[] args) {
		String s = "Hi,There I am using WhatsApp";
		String s1 = "This is an App";

		System.out.println(s.subSequence(4, 16));       	// subSequence():here I am us
		System.out.println(s.substring(3));  				// substring():There I am using WhatsApp
		System.out.println(s.substring(4, 10)); 			// here I

		System.out.println(String.join(" & ", s, s1)); 		// Hi,There I am using WhatsApp & This is an App

		System.out.println(s1.replace("is", "was")); 		// Thwas was an App
		System.out.println(s1.replaceFirst("is", "was")); 	// Thwas is an App
		System.out.println(s1.replaceAll("is", "was")); 	// Thwas was an App
		System.out.println(s1.replaceAll("is(.)", "was")); 	// Thwaswasan App
		System.out.println(s1.replaceAll("is(.*)", "was")); // Thwas

	}
}

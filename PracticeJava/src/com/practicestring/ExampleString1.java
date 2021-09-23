package com.practicestring;

public class ExampleString1 {

	public static void main(String[] args) {
		String name = "sourav";
		String email = "sourav@yahoo.com";
		String add = "dhenkanal";
		String st = "";
		System.out.println(name.length());
		int i = name.length();
		if (i == 0) {
			System.out.println("Name is Empty");
		} else {
			System.out.println("Print : " + name);
		}
		System.out.println(name.isEmpty());
		if (name.isEmpty() == true) {
			System.out.println("String is Empty");
		} else {
			System.out.println("String has a Name");
		}
		boolean b = st.isEmpty();
		if (b) {
			System.out.println("Name is Empty");
		} else {
			System.out.println("Valid Name");
		}
	}

}

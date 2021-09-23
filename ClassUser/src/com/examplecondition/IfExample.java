package com.examplecondition;

public class IfExample {

	public static void main(String[] args) {
		int x = 5;
		if (x == 5) {
			System.out.println("X is equal to 5");
		}
		String name = "abc";
		if (name == "abc") {
			// False Statement
			System.out.println("The value of name is abc");
		}
		if (name.equals("abc")) {
			// True Statement
			System.out.println("The value of name is abc");
		}
		char ch = 'H';
		if (ch == 'H') {
			System.out.println("The value of ch is Hello");
		}
	}

}

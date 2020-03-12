package com.epsilon.programs;

import java.util.Arrays;

public class GetQuotient {

	public static void main(String[] args) {
		try {
			String a =args[0];
			String b = args[1];
			int c= 4;
			int d= 0;
			int res = c/d;
			System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
			throw new NullPointerException();
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		} catch ()
	}

}

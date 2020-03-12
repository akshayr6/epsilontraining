package com.epsilon.util;

import java.util.Scanner;

public final  class KeyboardUtil {
	private KeyboardUtil() {

	public static String getString(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static int getInteger(String string) {
		System.out.println(string);
		Scanner sc = new Scanner(System.in);
		return Integer.parseInt(sc.nextLine());
	}
	public static double getDouble(double message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		return Integer.parseInt(sc.nextLine());
	}
}


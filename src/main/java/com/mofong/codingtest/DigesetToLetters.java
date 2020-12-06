package com.mofong.codingtest;

import java.util.HashMap;
import java.util.Map;

public class DigesetToLetters {

	private static String[] NUM0 = {};
	private static String[] NUM1 = {};
	private static String[] NUM2 = { "A", "B", "C" };
	private static String[] NUM3 = { "D", "E", "F" };
	private static String[] NUM4 = { "G", "H", "I" };
	private static String[] NUM5 = { "J", "K", "L" };
	private static String[] NUM6 = { "M", "N", "O" };
	private static String[] NUM7 = { "P", "Q", "R", "S" };
	private static String[] NUM8 = { "T", "U", "V" };
	private static String[] NUM9 = { "W", "X", "Y", "Z" };

	private static Map<Integer, String[]> map = new HashMap<Integer, String[]>();

	static {
		map.put(0, NUM0);
		map.put(1, NUM1);
		map.put(2, NUM2);
		map.put(3, NUM3);
		map.put(4, NUM4);
		map.put(5, NUM5);
		map.put(6, NUM6);
		map.put(7, NUM7);
		map.put(8, NUM8);
		map.put(9, NUM9);
	}

	public static String getAssembly(int[] array) {
		if (array.length > 2) {
			return "out of length";
		}
		StringBuilder sb = new StringBuilder();
		sb.append("Output: ");
		switch (array.length) {
		default:
			return sb.toString();
		case 1:
			for (String firstWord : map.get(array[0])) {
				sb.append(firstWord).append(" ");
			}
			return sb.toString().toLowerCase();
		case 2:
			for (String firstWord : map.get(array[0])) {
				for (String secondWord : map.get(array[1])) {
					sb.append(firstWord + secondWord).append(" ");
				}
			}
			return sb.toString().toLowerCase();
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 0 };
		System.out.println(getAssembly(array));
	}

}

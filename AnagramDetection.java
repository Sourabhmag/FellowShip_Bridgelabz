package com.BridgeLabz.AlgorithmsPrograms;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Sourabh Magdum
 * AnagramDetection = Accepts to strings and finds whether both are anagram of each other or not.
 */
public class AnagramDetection {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter strings");
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		if (string1.length() != string2.length()) {
			System.out.println("Given strings are not anagram");
			scanner.close();
			return;
		} else {
			char[] array1 = string1.toLowerCase().toCharArray();
			char[] array2 = string2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if (Arrays.equals(array1, array2)) {
				System.out.println("Given strings are anagram");
			} else {
				System.out.println("Given strings are not anagram");
			}
		}
		scanner.close();
	}
}

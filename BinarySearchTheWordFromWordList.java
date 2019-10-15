package com.BridgeLabz.AlgorithmsPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author Sourabh Magdum
 *  Functionality = Finds word searched by user is present in file or not 
 *
 */
public class BinarySearchTheWordFromWordList {
	/**
	 * Bubble Sort = Used to sort array
	 * @param str = input to bubble sort
	 * @return
	 */
	public static String[] bubbleSort(String[] str) {
		String temp;
		for (int j = 0; j < str.length; j++) {
			for (int i = j + 1; i < str.length; i++) {
				if (str[i].compareTo(str[j]) < 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
		}
		return str;
	}

	/**
	 * Binary Search
	 * @param words = List of word read from file
	 * @param search = Search keyword provided by user
	 */
	public static void Search(String[] words, String search) {
		words = bubbleSort(words);
		int l = 0, r = words.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			int res = search.compareTo(words[m]);

			// Check if x is present at mid
			if (res == 0) {
				System.out.println("Word found");
				return;
			}
			// If x greater
			if (res > 0)
				l = m + 1;

			// If x is smaller
			else
				r = m - 1;
		}
		System.out.println("Word not found");
	}

	public static void main(String[] args) throws Exception {
		File file = new File("/home/user/eclipse-workspace/com.BridgeLabz/src/com/BridgeLabz/AlgorithmsPrograms/sourabh.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		String[] words = null;
		while ((st = br.readLine()) != null) {
			words = st.split(" ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to be searched");
		String search = sc.nextLine();
		Search(words, search);
		br.close();sc.close();
	}
}

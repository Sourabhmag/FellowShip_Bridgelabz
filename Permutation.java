package com.BridgeLabz.AlgorithmsPrograms;

import java.util.Scanner;

import utility.Util;

public class Permutation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String length for permutation");
		int size = scanner.nextInt();
		System.out.println("Enter String");
		scanner.nextLine();
		Util.PermutationRecursive(scanner.nextLine(), 0, size - 1);
		scanner.close();
	}

}

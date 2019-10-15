package com.BridgeLabz.AlgorithmsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
	public void anagramCheck(int num1, int num2) {
		int temp1 = num1;
		int temp2 = num2;
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		//int i = 0, j = 0, val, flag = 0;
		while (num1 != 0) {
			// System.out.println("anagram while 1");
			list.add(num1 % 10);
			num1 /= 10;
		}
		while (num2 != 0) {
			// System.out.println("anagram while 2");
			list1.add(num2 % 10);
			num2 /= 10;
		}
		Collections.sort(list);
		Collections.sort(list1);
		if (list.equals(list1) == true) {
			System.out.println(temp1 + "\t" + temp2);
		}

	}

	public int primecheck(int num) {
		boolean flag = false;
		if (num == 0) {
			return 0;
		} else {
			if (num == 1) {
				return 0;
			} else {
				for (int i = 2; i <= num / 2; ++i) {
					System.out.println(i);
					if (num % i == 0) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					return num;
				} else {
					return 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		PrimeNumbers abc = new PrimeNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int num1, num2;
		for (int i = 0; i < num; i++) {
			num1 = abc.primecheck(i);
			if (num1 == 0) {
				continue;
			} else {
				for (int j = i; j < num; j++) {
					num2 = abc.primecheck(j);
					// System.out.println("Checking anagram");
					if (num1 == 0) {
						continue;
					} else {
						if (num1 == num2) {
							continue;
						} else {
							abc.anagramCheck(num1, num2);
						}
					}
				}
			}
		}
		sc.close();
	}
}

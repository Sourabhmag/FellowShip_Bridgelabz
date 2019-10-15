package com.BridgeLabz.AlgorithmsPrograms;
import utility.Util;
import java.util.Scanner;
public class  MergeSort{
	Scanner sc = new Scanner(System.in);
	

	public static void main(String args[]) {
		MergeSort obj = new MergeSort();
		System.out.println("Enter number of String");
		int numberOfStrings = obj.sc.nextInt();
		obj.sc.nextLine();
		String[] array = new String[numberOfStrings];
		for(int i=0;i<numberOfStrings;i++)
		{
			array[i]=obj.sc.nextLine();
		}
		String []sorted=Util.mergeSort(array);
		Util.display(sorted);
		
	}
}

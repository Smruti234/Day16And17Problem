package Com.DsAndAl;

import java.util.Arrays;
import java.util.Scanner;

public class P3InsertionSort {
	public static void sort(String[] string) {
		int length = string.length;
		for (int i = 0; i < length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (string[j].compareTo(string[j - 1]) < 0) {
                    String temp = string[j];
                    string[j] = string[j - 1];
                    string[j - 1] = temp;
                }
            }
		}
	}

	public static void printStringArray(String str[]) {
		int n = str.length;
		for (int i = 0; i < n; i++)
			System.out.println(str[i]);
	}
	
	public static String[] inputTheString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of String Array");
		int size = scanner.nextInt();
		scanner.nextLine();
		String[] stringArray = new String[size];
 		for(int i=0;i<size;i++) {
			System.out.println("Enter Array[" + i + "] element");
			String string = scanner.nextLine();
			stringArray[i] = string;
		}
 		return stringArray;
	}

	public static void main(String args[]) {
		String[] string = inputTheString();
		System.out.println("Array after sorting");
		sort(string);
		printStringArray(string);
	}
}

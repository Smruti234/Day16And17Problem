package Com.DsAndAl;

import java.util.Arrays;
import java.util.Scanner;

public class P2BinarySearchWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of words to be sorted: ");
		int arraySize1 = scanner.nextInt();
		scanner.nextLine();
		String b[] = input1DStringArray(arraySize1);
		Arrays.sort(b);

		System.out.println("The Sorted Order is: ");
		print1DStringArray(b);

		System.out.println("Enter Key: ");
		String inputString = scanner.nextLine();
		int p = binarySearchString(b, inputString);

		if (p == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found at " + p + " position");
		}
	}

	public static String[] input1DStringArray(int arraySize) {
		String array[] = new String[arraySize];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter array[" + i + "] : ");
			String inputString = scan.nextLine();
			array[i] = inputString;
		}
		return array;
	}

	public static int binarySearchString(String[] names, String key) {
		int first = 0;
		int last = names.length;

		while (first < last) {
			int mid = (first + last) / 2;
			if (key.compareTo(names[mid]) < 0) {
				last = mid;
			} else if (key.compareTo(names[mid]) > 0) {
				first = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void print1DStringArray(String array[]) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

}

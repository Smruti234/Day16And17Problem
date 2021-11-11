package Com.DsAndAl;

import java.util.Arrays;

public class P1PermutationsOfString {
	public static void main(String[] args) {
		String string = "ABC";
		int n = string.length();
		recursivePermutation(string, 0, n - 1);
		System.out.println();
		iterativePermutation(string);
	}

	private static void recursivePermutation(String string, int start, int end) {
		if (start == end) {
			System.out.print(string + " ");
		} else {
			for (int i = start; i <= end; i++) {
				string = swap(string, start, i);
				recursivePermutation(string, start + 1, end);
			}
		}
	}

	private static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void iterativePermutation(String str) {
		if (str == null || str.length() == 0) {
			return;
		}

		if (str.length() == 1) {
			System.out.print(str);
			return;
		}

		char[] chars = str.toCharArray();
		Arrays.sort(chars);

		int n = str.length();

		while (true) {
			System.out.print(String.valueOf(chars) + " ");

			int i = n - 1;
			while (chars[i - 1] >= chars[i]) {
				if (--i == 0) {
					return;
				}
			}

			int j = n - 1;
			while (j > i && chars[j] <= chars[i - 1]) {
				j--;
			}

			swap(chars, i - 1, j);

			reverse(chars, i, n - 1);
		}
	}

	private static void swap(char[] arr, int i, int j) {
		char c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}

	private static void reverse(char[] arr, int i, int j) {
		while (i < j) {
			swap(arr, i++, j--);
		}
	}
}

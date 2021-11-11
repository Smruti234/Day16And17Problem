package Com.DsAndAl;

import java.util.Scanner;

public class P4BubbleSort {
	private static void bubbleSort(int array[]) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Array Elements after sorting: ");
		for (int i = 0; i < length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements you want in the array: ");
		int count = scan.nextInt();

		int number[] = new int[count];
		System.out.println("Enter array elements:");
		for (int i = 0; i < count; i++) {
			number[i] = scan.nextInt();
		}
		scan.close();
		bubbleSort(number);
	}
}

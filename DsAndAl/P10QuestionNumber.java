package Com.DsAndAl;

import java.util.Scanner;

public class P10QuestionNumber {

	static int range, count, lower, upper, middle;
		static String input;
	
		public static void binarySearch(int lower, int upper, int middle, int count, String input, int n) {
			System.out.println("Is your number:" + middle);
			System.out.println();
			System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
			input = inputString();
			do {
				if (input.equals("high")) {
					lower = middle;
					count++;
				} else if (input.equals("yes")) {
					System.out.println("The number you thought was: " + middle);
					int no = count + 1;
					System.out.println("It takes " + no + " times to find your exact number");
					break;
				} else if (input.equals("low")) {
					upper = middle;
					count++;
				}
				if (count < n) {
					middle = (lower + upper + 1) / 2;
					System.out.println("Is your number " + middle + ":");
					input = inputString();
				}
			} while (lower <= upper);
			if (count > n) {
				System.out.println("Number not found");
			} else {
				System.exit(0);
			}
		}
	
		public static void main(String[] args) {
			// Utility u=new Utility();
			System.out.println("Enter any Number:");
			int n = inputInteger();
			range = (int) (Math.pow(2, n - 1));
			System.out.println("Take number between '0' to " + range);
			count = 0;
			input = null;
			lower = 0;
			upper = range;
			middle = (lower + upper / 2);
			binarySearch(lower, upper, middle, count, input, n);
		}
	
		public static String inputString() {
			Scanner scan = new Scanner(System.in);
			String string = scan.nextLine();
			return string;
		}
	
		public static int inputInteger() {
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			return number;
		}

}

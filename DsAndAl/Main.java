package Com.DsAndAl;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Queue<Character> queue = new Queue<Character>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String string = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < string.length(); i++) {
			char character = string.charAt(i);
			queue.addRear(character);
		}
		int flag = 0;
		while (queue.size() > 1) {
			if (queue.removeFront() != queue.removeRear()) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}

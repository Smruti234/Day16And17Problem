package Com.DsAndAl;

import java.util.Arrays;

public class P6AnagramDetection {
	static void isAnagram(String string1, String string2) {
		boolean status = true;
		if (string1.length() != string2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = string1.toLowerCase().toCharArray();
			char[] ArrayS2 = string2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			System.out.println(string1 + " and " + string2 + " are anagrams");
		} else {
			System.out.println(string1 + " and " + string2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {
		isAnagram("erit", "tyum");
	}
}

package Com.DsAndAl;

public class PrimeNumberRange {

	private static void getPrimeNumbers() {
			for (int i = 0; i <= 1000; i++) {
				int counter = 0;
				for (int j = i; j >= 1; j--) {
					if (i % j == 0) {
						counter = counter + 1;
					}
				}
				if (counter == 2) {
					System.out.println(i);
				}
			}
		}
	
		public static void main(String[] args) {
			getPrimeNumbers();
		}
}

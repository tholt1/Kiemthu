

public class FinMax {

	/**
	 * Method to find max
	 */
	public void finMax(int a, int b, int c) {
		int max = 0;
	//	System.out.println(a + " " + b + " " + c);

		if ((a > 0) & (b > 0) & (c > 0)) {
			max = a;
			if (max < b) {
				max = b;
			} else if (max < c) {
				max = c;
			}
			System.out.println("Max:" + max);
		} else {
			System.out.println("Error");
		}
	}
}

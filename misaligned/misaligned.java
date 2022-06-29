public class misaligned {
	static int printColorMap() {
		String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
		String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
		int i = 0, j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				String pair = (i * 5 + j) + "|" + majorColors[i] + "|" + minorColors[j];
				System.out.printf("%d | %s | %s\n", i * 5 + j, majorColors[i], minorColors[j]);
				MisalignedTest.checkPair(pair, majorColors, minorColors);
				}
		}
		return i * j;
	}

	public static void main(String[] args) {
		int result = printColorMap();
		assert (result == 25);
		System.out.println("All is well (maybe!)" + result);
	}
}
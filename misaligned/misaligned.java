public class misaligned {
	static int printColorMap() {
		String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
		String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
		int i = 0, j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				String pair = (i * 5 + j) + "|" + majorColors[i] + "|" + minorColors[i];
				checkPair(pair, majorColors, minorColors);
				System.out.printf("%d | %s | %s\n", i * 5 + j, majorColors[i], minorColors[i]);
			}
		}
		return i * j;
	}
	public static void checkPair(String pairString, String[] majorColors, String[] minorColors) {
		String array = pairString.substring(0, pairString.indexOf("|"));
		int pair = Integer.parseInt(array);
		String actualMajorColor = majorColors[pair / majorColors.length];
		String actualMinorColor = minorColors[pair % minorColors.length];
		String actualPair = new String(array + " | " + actualMajorColor + " | " + actualMinorColor);
		System.out.println(actualPair);
		assert (pairString.contentEquals(actualPair));

	}

	public static void main(String[] args) {
		int result = printColorMap();
		assert (result == 25);
		System.out.println("All is well (maybe!)" + result);
	}
}
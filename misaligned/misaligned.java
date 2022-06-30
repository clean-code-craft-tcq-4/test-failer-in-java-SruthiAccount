import java.util.HashMap;

public class misaligned {
	static HashMap<String, String[]> colorMap = new HashMap<String, String[]>();

	static int printColorMap() {
		String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
		String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
		String[] allPairs = new String[majorColors.length * minorColors.length];

		int i = 0, j = 0;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				String pair = (i * 5 + j) + "|" + majorColors[i] + "|" + minorColors[j];
				allPairs[i * 5 + j] = pair;
				System.out.printf("%d | %s | %s\n", i * 5 + j, majorColors[i], minorColors[j]);
			}
		}
		colorMap.put("allPairs", allPairs);
		colorMap.put("majorColors", majorColors);
		colorMap.put("minorColors", minorColors);

		return i * j;
	}

	public static void main(String[] args) {
		int result = printColorMap();
		assert (result == 25);
		MisalignedTest.checkPair(colorMap);

		System.out.println("All is well (maybe!)" + result);
	}
}
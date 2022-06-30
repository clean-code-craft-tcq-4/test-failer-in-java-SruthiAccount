import java.util.Map;

public class MisalignedTest {
	public static void checkPair(Map<String, String[]> colorMap) {
		String[] majorColors = colorMap.get("majorColors");
		String[] minorColors = colorMap.get("minorColors");

		for (int i = 0; i < majorColors.length; i++) {
			for (int j = 0; j < minorColors.length; j++) {
				String pairString = colorMap.get("allPairs")[i * 5 + j];
				String array = pairString.substring(0, pairString.indexOf("|"));
				int pair = Integer.parseInt(array);
				String actualMajorColor = majorColors[pair / majorColors.length];
				String actualMinorColor = minorColors[pair % minorColors.length];
				String actualPair = new String(array + "|" + actualMajorColor + "|" + actualMinorColor);
				System.out.println(actualPair.contentEquals(pairString));
			}
		}

	}
}

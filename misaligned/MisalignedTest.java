
public class MisalignedTest {
	public static void checkPair(String pairString, String[] majorColors, String[] minorColors) {
		String array = pairString.substring(0, pairString.indexOf("|"));
		int pair = Integer.parseInt(array);
		String actualMajorColor = majorColors[pair / majorColors.length];
		String actualMinorColor = minorColors[pair % minorColors.length];
		String actualPair = new String(array + "|" + actualMajorColor + "|" + actualMinorColor);
		assert (actualPair.contentEquals(pairString));

	}
}

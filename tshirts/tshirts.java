public class tshirts {
	static String size(int cms) {
		if (cms < 38) {
			return "S";
		} else if (cms > 38 && cms < 42) {
			return "M";
		} else {
			return "L";
		}
	}
	public static void testSize() {
		assert (tshirts.size(37) == "S");
		assert (tshirts.size(38) == "S");
		assert (tshirts.size(38) == "M");
		assert (tshirts.size(40) == "M");
		assert (tshirts.size(42) == "M");
		assert (tshirts.size(43) == "L");
		System.out.println("All is well (maybe!)");
	}
	public static void main(String[] args) {
		/*TShirtsTest test = new TShirtsTest();
		test.*/testSize();
	}
}

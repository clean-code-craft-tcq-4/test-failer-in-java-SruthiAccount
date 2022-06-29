public class TShirtsTest {
	public void testSize() {
		assert (tshirts.size(37) == "S");
		assert (tshirts.size(38) == "M");
		assert (tshirts.size(40) == "M");
		assert (tshirts.size(42) == "M");
		assert (tshirts.size(43) == "L");
		System.out.println("All is well (maybe!)");
	}
}

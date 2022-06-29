public class alerter {
	static int alertFailureCount = 0;

	static void alertInCelcius(float farenheit) {
		float celcius = (farenheit - 32) * 5 / 9;
		NetworkAlertInterface alert = new NetworkAlert();
		int returnCode = alert.networkAlertStub(celcius);
		if (returnCode != 200) {
			// non-ok response is not an error! Issues happen in life!
			// let us keep a count of failures to report
			// However, this code doesn't count failures!
			// Add a test below to catch this bug. Alter the stub above, if needed.
			alertFailureCount += 1;
		}
	}

	public static void main(String[] args) {
		alertInCelcius(400.5f);
		alertInCelcius(303.6f);
		AlerterTest.testAlertFailureCount();
		System.out.printf("%d alerts failed.\n", alertFailureCount);
		System.out.println("All is well (maybe!)\n");
	}
}

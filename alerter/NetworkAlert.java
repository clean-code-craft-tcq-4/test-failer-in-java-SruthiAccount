
public class NetworkAlert implements NetworkAlertInterface {

	public int networkAlertStub(float celcius) {
		System.out.println("ALERT: Temperature is " + celcius + " celcius");
		if (celcius > 100.00f) {
			return 500;
		}
		// Return 200 for ok
		// Return 500 for not-ok
		// stub always succeeds and returns 200
		return 200;
	}

}

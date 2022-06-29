public class AlerterTest {
	public static void testAlertFailureCount() {
		alerter.alertInCelcius(500.0f);
		assert (alerter.alertFailureCount == 3);
		alerter.alertInCelcius(50.0f);
		assert (alerter.alertFailureCount == 3);
	}
}


public class AlerterTest {
	public static void testAlertFailureCount() {
		alerter.alertInCelcius(500.0f);
		assert (alerter.alertFailureCount == 1);
		alerter.alertInCelcius(450.0f);
		assert (alerter.alertFailureCount == 2);
	}
}

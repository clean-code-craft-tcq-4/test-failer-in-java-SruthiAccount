public class AlerterTest {
	public static void testAlertFailureCount() {
		alerter.alertInCelcius(212f);
		System.out.println(alerter.alertFailureCount == 2);
		alerter.alertInCelcius(213f);
		System.out.println(alerter.alertFailureCount == 3);
		alerter.alertInCelcius(500.0f);
		System.out.println(alerter.alertFailureCount == 4);
		alerter.alertInCelcius(50.0f);
		System.out.println(alerter.alertFailureCount == 4);
	}
}

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("[STRATEGY] Paying $" + amount + " using CREDIT CARD");
        System.out.println("  - Validating card number...");
        System.out.println("  - Checking available credit...");
        System.out.println("  - Charging card...");
    }
}

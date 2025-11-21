public class PaypalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("[STRATEGY] Paying $" + amount + " using PAYPAL");
        System.out.println("  - Logging in to PayPal account...");
        System.out.println("  - Confirming balance...");
        System.out.println("  - Transferring funds...");
    }
}

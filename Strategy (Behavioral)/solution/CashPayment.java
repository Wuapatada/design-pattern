public class CashPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("[STRATEGY] Paying $" + amount + " using CASH");
        System.out.println("  - Counting cash...");
        System.out.println("  - Verifying authenticity of bills...");
        System.out.println("  - Registering cash payment...");
    }
}

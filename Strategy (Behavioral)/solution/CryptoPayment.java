public class CryptoPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("[STRATEGY] Paying $" + amount + " using CRYPTO");
        System.out.println("  - Connecting to blockchain network...");
        System.out.println("  - Verifying wallet address...");
        System.out.println("  - Broadcasting transaction...");
    }
}


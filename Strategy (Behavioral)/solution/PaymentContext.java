public class PaymentContext {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("No payment strategy configured");
        }
        strategy.pay(amount);
    }
}

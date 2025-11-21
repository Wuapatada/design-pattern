
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pago con tarjeta de crédito
        context.setStrategy(new CreditCardPayment());
        context.process(500.0);

        // Pago con PayPal
        context.setStrategy(new PaypalPayment());
        context.process(1200.0);

        // Pago con criptomonedas
        context.setStrategy(new CryptoPayment());
        context.process(250.0);

        // Pago en efectivo (ejemplo de extensión)
        context.setStrategy(new CashPayment());
        context.process(100.0);
    }
}

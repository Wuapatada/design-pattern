# Kata: Strategy – Challenge

## Contexto

Tienes un sistema de pagos en línea con una clase `PaymentProcessor` que decide cómo procesar el pago según un `String` con el tipo de pago:

- `"CREDIT_CARD"`
- `"PAYPAL"`
- `"CRYPTO"`
- Otros que se vayan agregando.

Actualmente el código usa un gran bloque de `if/else` para decidir qué hacer para cada tipo. Esto hace que el código sea difícil de mantener, probar y extender.

---

## Código actual (a refactorizar)

### `Main.java`

```java
package strategy.challenge;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment("CREDIT_CARD", 500.0);
        processor.processPayment("PAYPAL", 1200.0);
        processor.processPayment("CRYPTO", 250.0);
        processor.processPayment("CASH", 100.0);
    }
}

```

### 'PaymentProcessor.java'


```java
package strategy.challenge;
public class PaymentProcessor {

    public void processPayment(String type, double amount) {
        if ("CREDIT_CARD".equalsIgnoreCase(type)) {
            System.out.println("[CREDIT_CARD] Processing credit card payment of $" + amount);
            System.out.println("  - Validating card number...");
            System.out.println("  - Checking available credit...");
            System.out.println("  - Charging card...");
        } else if ("PAYPAL".equalsIgnoreCase(type)) {
            System.out.println("[PAYPAL] Processing PayPal payment of $" + amount);
            System.out.println("  - Logging in to PayPal account...");
            System.out.println("  - Confirming balance...");
            System.out.println("  - Transferring funds...");
        } else if ("CRYPTO".equalsIgnoreCase(type)) {
            System.out.println("[CRYPTO] Processing crypto payment of $" + amount);
            System.out.println("  - Connecting to blockchain network...");
            System.out.println("  - Verifying wallet address...");
            System.out.println("  - Broadcasting transaction...");
        } else {
            System.out.println("[ERROR] Unsupported payment type: " + type);
        }
    }
}
```
Problemas a identificar

-PaymentProcessor tiene demasiadas responsabilidades.

-Cada nueva forma de pago implica modificar esta clase.

-Violación del principio abierto/cerrado.

-Dificultad para probar cada comportamiento de manera aislada.




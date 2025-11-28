# Reto(Strategy) 

## Instrucciones del reto

Tienes un sistema de pagos que utiliza una clase `PaymentProcessor` para procesar diferentes métodos de pago: **CREDIT_CARD**, **PAYPAL** y **CASH**.

Actualmente, `PaymentProcessor` usa condicionales (`if`/`else`) para decidir qué lógica ejecutar.  
Tu tarea es **identificar los problemas de diseño** y **refactorizar el código** aplicando el patrón **Strategy**.

> Importante: No cambies el comportamiento observable del sistema (la salida en consola debe seguir siendo coherente con el tipo de pago).

---

## Contexto del sistema

El usuario ejecuta el programa, elige un método de pago y proporciona un monto.  
La clase `PaymentProcessor` se encarga de:

- Validar el tipo de pago.
- Imprimir mensajes específicos según el método.
- Simular el procesamiento del pago.

Queremos que este comportamiento se mantenga, pero con un diseño más flexible.

---

## Código a Refactorizar

### Archivo: `challenge/Main.java`

```java
package strategy.challenge;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment("CREDIT_CARD", 500.0);
        processor.processPayment("PAYPAL", 250.0);
        processor.processPayment("CASH", 100.0);

        // Si se intenta un método no soportado:
        processor.processPayment("CRYPTO", 999.0);
    }
}

```

### 'challenge/PaymentProcessor.java'


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
## Problemas a identificar
-PaymentProcessor tiene demasiadas responsabilidades.

-El uso de múltiples if/else provoca:

-Código difícil de extender.

-Violación del principio abierto/cerrado (OCP).

-Si se agrega un nuevo tipo de pago:

-Hay que modificar PaymentProcessor.

-Aumenta el riesgo de introducir errores.

-No hay una abstracción común para las estrategias de pago.

## Objetivo del refactor
-Crear una interfaz común de pago (por ejemplo PaymentStrategy).
-Crear una clase concreta por cada tipo de pago.
-Hacer que el código cliente use polimorfismo en lugar de condicionales.

## Tips

¿Qué comportamiento es común a todas las formas de pago?
→ Identifica ese comportamiento y conviértelo en una interfaz.

¿Qué partes del código cambian cuando agregas un nuevo tipo de pago?
→ Esas partes son candidatas a convertirse en estrategias.

¿Cómo puedes evitar que PaymentProcessor conozca todos los tipos concretos?
→ Haz que dependa de la abstracción, no de las implementaciones.

Recuerda:

El cliente no debería saber cómo se procesa el pago, solo debería pedir que se procese.



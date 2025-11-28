Solution
# Solucion(Strategy)

 ⚠️ **Sugerencia**

 Revisa esta solución **solo después** de haber intentado el reto por tu cuenta.  
 El objetivo de la kata es practicar el razonamiento de diseño, no solo copiar código.

---

## Cambios principales realizados

1. **Creación de la interfaz `PaymentStrategy`**
   - Define el contrato común para todas las estrategias de pago:
     ```java
     void pay(double amount);
     ```

2. **Creación de estrategias concretas**
   - `CreditCardPayment`
   - `PaypalPayment`
   - `CryptoPayment`
   - `CashPayment` (ejemplo de extensión)
   Cada una implementa `PaymentStrategy` y encapsula los pasos específicos de cada forma de pago.

3. **Creación del contexto `PaymentContext`**
   - Mantiene una referencia a `PaymentStrategy`.
   - Permite cambiar la estrategia en tiempo de ejecución mediante `setStrategy`.
   - Expone un método `process(double amount)` que delega a la estrategia.

4. **Actualización de `Main`**
   - Ya no hay `if/else` por tipo de pago.
   - Se crean diferentes estrategias y se asignan al contexto para procesar pagos.

---

## Salida esperada (ejemplo)

Al ejecutar `strategy.solution.Main`, puedes obtener algo como:

```text
[STRATEGY] Paying $500.0 using CREDIT CARD
  - Validating card number...
  - Checking available credit...
  - Charging card...

[STRATEGY] Paying $1200.0 using PAYPAL
  - Logging in to PayPal account...
  - Confirming balance...
  - Transferring funds...

[STRATEGY] Paying $250.0 using CRYPTO
  - Connecting to blockchain network...
  - Verifying wallet address...
  - Broadcasting transaction...

[STRATEGY] Paying $100.0 using CASH
  - Counting cash...
  - Verifying authenticity of bills...
  - Registering cash payment...

```
Principios aplicados

SRP – Cada estrategia se ocupa de una sola cosa: un tipo de pago.

OCP – El sistema es extensible añadiendo nuevas estrategias, sin tocar código existente.

DIP – El contexto depende de la abstracción PaymentStrategy, no de implementaciones concretas.

Usando este enfoque, tu sistema está preparado para seguir creciendo sin volverse una bola de if/else.


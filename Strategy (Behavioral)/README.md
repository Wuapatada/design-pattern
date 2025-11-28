# Kata: Strategy

## Contexto del problema

Estás trabajando en un sistema de pagos en línea.  
Actualmente tienes una clase `PaymentProcessor` que recibe un tipo de pago como `String` (`"CREDIT_CARD"`, `"PAYPAL"`, `"CRYPTO"`, etc.) y dentro de un gran bloque de `if/else` decide:

- Qué pasos ejecutar.
- Cómo validar la información.
- Cómo procesar el pago.

Cada vez que el negocio agrega una nueva forma de pago (por ejemplo, `CASH`, `BANK_TRANSFER`, etc.) tienes que **volver a modificar** `PaymentProcessor`, agregar otro `if` y mezclar más lógica en la misma clase.

Problemas actuales:

- Mucho `if/else` con lógica mezclada.
- Difícil de extender sin tocar código existente (rompe el principio abierto/cerrado).
- Difícil de probar y mantener.
- No se puede cambiar el "comportamiento de pago" dinámicamente sin tocar el código de la clase.

---

## El patrón: Strategy

El patrón **Strategy** permite **encapsular algoritmos** (comportamientos) en clases separadas e intercambiarlos en tiempo de ejecución.

En este contexto:

- Definimos una **interfaz** `PaymentStrategy` con la operación `pay(double amount)`.
- Creamos una **estrategia concreta** por cada forma de pago:
  - `CreditCardPayment`
  - `PaypalPayment`
  - `CryptoPayment`
  - `CashPayment` (u otras que agregues)
- Usamos una clase **contexto** `PaymentContext` que mantiene una referencia a una `PaymentStrategy` y delega en ella el procesamiento del pago.

Así, el “algoritmo” de pago no está fijo dentro de `PaymentProcessor`, sino que vive en clases intercambiables.

---

## Beneficios principales

- **Principio abierto/cerrado (OCP)**  
  Puedes agregar nuevas estrategias de pago (nuevas clases) **sin modificar** las estrategias existentes ni el contexto.

- **Principio de responsabilidad única (SRP)**  
  Cada clase de estrategia se enfoca en una sola forma de pago.  
  El contexto solo coordina, no sabe los detalles internos de cada algoritmo.

- **Polimorfismo**  
  El código cliente trabaja con la interfaz `PaymentStrategy`.  
  No necesita saber si es tarjeta, PayPal o crypto: solo llama `strategy.pay(amount)`.

- **Reducción de acoplamiento**  
  La lógica de decisión (`if/else` por tipo de pago) desaparece del núcleo de la aplicación.  
  El cambio de comportamiento se logra configurando otra estrategia.

- **Mayor reutilización**  
  Las estrategias pueden reutilizarse en otros contextos que necesiten el mismo comportamiento.

---

## ¿Cuándo usar este patrón?

Usa **Strategy** cuando:

- Tienes **múltiples variantes de un mismo algoritmo** (por ejemplo, diferentes formas de pago, diferentes formas de calcular descuento, diferentes formas de ordenar, etc.).
- Quieres **cambiar el comportamiento en tiempo de ejecución**, eligiendo o cambiando la estrategia adecuada según el contexto.
- Tu clase tiene muchos `if/else` o `switch` que seleccionan comportamientos según un tipo o estado.
- Quieres **limpiar** una clase que hace demasiadas cosas y extraer comportamientos en clases independientes.

---

## Principios SOLID aplicados

- **S – Single Responsibility Principle (SRP)**  
  Cada estrategia concreta tiene una única responsabilidad: implementar una forma específica de pago.

- **O – Open/Closed Principle (OCP)**  
  Para agregar una nueva forma de pago, solo creas una nueva clase que implementa `PaymentStrategy`.  
  No necesitas modificar el código existente.

- **D – Dependency Inversion Principle (DIP)**  
  El contexto (`PaymentContext`) depende de la **abstracción** `PaymentStrategy`, no de implementaciones concretas.

---

## Referencias externas

- *Head First Design Patterns* – Capítulo de Strategy.
- *Design Patterns: Elements of Reusable Object-Oriented Software* (GoF) – Strategy Pattern.
- Artículo “Strategy Pattern” en Refactoring.Guru.
- Repositorio de referencia del curso:  
  `https://github.com/luisburgos/design_patterns_katas`


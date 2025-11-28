# Kata: Facade

## Contexto

Estás trabajando en un sistema de compras en línea. Para completar una orden
el cliente necesita:

- Validar el inventario del producto.
- Procesar el pago.
- Generar la guía de envío.

Actualmente, el código cliente conoce y llama directamente a varios servicios:
`InventoryService`, `PaymentService` y `ShippingService`. Esto hace que el
código sea difícil de leer, probar y mantener, porque cada cliente debe saber
el orden correcto de las llamadas y manejar todos los detalles.

## El Patrón: Facade

El patrón **Facade** proporciona una interfaz unificada y sencilla para un
subconjunto de clases del sistema. En lugar de que el cliente interactúe con
muchas clases complejas, se le ofrece una "fachada" que encapsula la lógica
de orquestación.

En este caso, una clase `OrderFacade` se encarga de:

- Validar inventario.
- Procesar el pago.
- Solicitar el envío.

El cliente solo llama a un método como `placeOrder(...)`.

## ¿Cuándo usar este patrón?

- Cuando tienes un subsistema complejo con muchas clases y deseas una interfaz
  simple para la mayoría de los clientes.
- Cuando quieres reducir el acoplamiento entre el código cliente y muchos
  servicios internos.
- Cuando quieres definir un punto de entrada claro para un módulo o subsistema.

## Beneficios

- **Principio de responsabilidad única (SRP)**: la fachada concentra la lógica
  de orquestación en una sola clase.
- **Menor acoplamiento**: el cliente deja de depender de todos los servicios
  internos.
- **Código más legible**: el flujo de "realizar una orden" se ve en una sola
  operación de alto nivel.
- **Más fácil de cambiar** la implementación interna sin afectar al cliente.

## Principios SOLID aplicados

- **SRP**: La fachada tiene la única responsabilidad de coordinar servicios.
- **OCP**: Puedes cambiar o extender los servicios internos sin modificar a
  los clientes que usan la fachada.
- **DIP**: La fachada puede depender de interfaces de servicios, no de
  implementaciones concretas.

## Referencias

- “Design Patterns: Elements of Reusable Object-Oriented Software” (GoF).
- Repositorio de referencia de patrones de diseño del curso.

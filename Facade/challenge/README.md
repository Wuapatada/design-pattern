# Reto(Facade)

## Contexto

En el sistema de compras en línea, el flujo para procesar una orden es:

1. Verificar que haya inventario.
2. Cobrar al cliente.
3. Generar la guía de envío.

El código actual hace que el cliente llame directamente a tres servicios:
`InventoryService`, `PaymentService` y `ShippingService`. Cada vez que quieres
procesar una orden tienes que repetir la misma lógica.

## Problemas a identificar

- El código cliente:
  - Conoce demasiados detalles del proceso.
  - Depende directamente de varias clases internas.
  - Duplica el flujo de negocio en varios lugares.
- Resulta difícil:
  - Mantener el flujo de compra.
  - Agregar pasos nuevos (por ejemplo, enviar un correo de confirmación).
  - Reutilizar la lógica en otros clientes.

## Instrucciones

1. Abre `Main.java`.
2. Identifica cómo el código cliente usa directamente a los servicios:
   - `InventoryService`
   - `PaymentService`
   - `ShippingService`
3. Refactoriza creando una clase `OrderFacade` que:
   - Reciba las dependencias de los servicios.
   - Exponga un método `placeOrder(String productId, int quantity, String customerEmail)`.
   - Oculte los detalles de:
     - Verificación de inventario.
     - Procesamiento de pago.
     - Creación de la guía de envío.
4. Modifica el código de `Main` para que solo interactúe con `OrderFacade`.

## Tips

- Piensa en la fachada como un **punto de entrada único** al subsistema.
- El cliente no debería conocer ni el orden ni los detalles de las llamadas.
- No intentes hacer la fachada “demasiado genérica”; concéntrate en la historia
  de usuario principal: "realizar una orden".

## Recursos adicionales
- Libro: “Head First Design Patterns”, capítulo sobre Facade.

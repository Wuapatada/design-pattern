# Solución (Facade)

> ⚠️ Revisa esta solución solo después de haber intentado resolver el reto por tu cuenta.

## Cambios principales

- Se creó la clase `OrderFacade` como punto de entrada único para el
  procesamiento de órdenes.
- `Main` ahora depende solo de `OrderFacade` y ya no conoce:
  - `InventoryService`
  - `PaymentService`
  - `ShippingService`
- La lógica del flujo de negocio (inventario → pago → envío) quedó encapsulada
  dentro de la fachada.

## Código clave

- `OrderFacade.placeOrder(String productId, int quantity, String customerEmail)`
  orquesta todo el proceso.
- El cliente queda con una llamada simple y legible.

## Salida esperada

Ejemplo de salida de la aplicación:

```text
=== Procesando orden CON Facade ===
[InventoryService] Verificando inventario de SKU-123
[PaymentService] Cobrado 500.0 a cliente@example.com
[ShippingService] Creando envío para cliente@example.com
Orden completada. Tracking: TRACK-XYZ-123

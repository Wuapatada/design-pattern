public class Main {

    public static void main(String[] args) {
        // Código cliente ACOPLADO a varios servicios.
        InventoryService inventoryService = new InventoryService();
        PaymentService paymentService = new PaymentService();
        ShippingService shippingService = new ShippingService();

        String productId = "SKU-123";
        int quantity = 2;
        String customerEmail = "cliente@example.com";

        System.out.println("=== Procesando orden SIN Facade ===");

        if (inventoryService.hasStock(productId, quantity)) {
            boolean paymentOk = paymentService.charge(customerEmail, 500.0);

            if (paymentOk) {
                String trackingCode = shippingService.createShipment(customerEmail, productId, quantity);
                System.out.println("Orden completada. Tracking: " + trackingCode);
            } else {
                System.out.println("No se pudo procesar el pago.");
            }
        } else {
            System.out.println("No hay inventario suficiente.");
        }


    }
}





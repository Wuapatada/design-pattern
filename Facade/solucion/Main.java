
public class Main {

    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();
        PaymentService paymentService = new PaymentService();
        ShippingService shippingService = new ShippingService();

        OrderFacade orderFacade = new OrderFacade(
                inventoryService,
                paymentService,
                shippingService
        );

        System.out.println("=== Procesando orden CON Facade ===");
        String productId = "SKU-123";
        int quantity = 2;
        String customerEmail = "cliente@example.com";

        orderFacade.placeOrder(productId, quantity, customerEmail);
    }
}


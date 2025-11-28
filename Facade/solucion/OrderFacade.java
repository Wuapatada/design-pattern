class OrderFacade {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public OrderFacade(InventoryService inventoryService,
                       PaymentService paymentService,
                       ShippingService shippingService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
    }

    public void placeOrder(String productId, int quantity, String customerEmail) {
        if (!inventoryService.hasStock(productId, quantity)) {
            System.out.println("No hay inventario suficiente.");
            return;
        }

        boolean paymentOk = paymentService.charge(customerEmail, 500.0);
        if (!paymentOk) {
            System.out.println("No se pudo procesar el pago.");
            return;
        }

        String trackingCode = shippingService.createShipment(customerEmail, productId, quantity);
        System.out.println("Orden completada. Tracking: " + trackingCode);
    }
}
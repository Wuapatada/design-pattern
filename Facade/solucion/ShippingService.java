class ShippingService {
    public String createShipment(String customerEmail, String productId, int quantity) {
        System.out.println("[ShippingService] Creando envío para " + customerEmail);
        return "TRACK-XYZ-123";
    }
}

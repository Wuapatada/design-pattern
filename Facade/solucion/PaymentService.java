
class PaymentService {
    public boolean charge(String customerEmail, double amount) {
        System.out.println("[PaymentService] Cobrado " + amount + " a " + customerEmail);
        return true;
    }
}


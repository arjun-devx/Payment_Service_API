package devx.arjun.PaymentService.paymentGateway;

public interface PaymentGateway {
    String generatePaymentLink(String orderId, double amount, String userId);
}
package devx.arjun.PaymentService.paymentGateway;
import com.stripe.exception.StripeException;
public interface PaymentGateway {
    String generatePaymentLink(String orderId, long amount, String userId) throws StripeException;
}
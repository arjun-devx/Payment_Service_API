package devx.arjun.PaymentService.services;
import com.stripe.exception.StripeException;
import devx.arjun.PaymentService.paymentGateway.PaymentGateway;
import devx.arjun.PaymentService.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    @Qualifier("stripePayment")
    private PaymentGateway paymentGateway;

    public String generatePaymentLink(String orderId, long amount, String userId) throws StripeException {
        String paymentLink = paymentGateway.generatePaymentLink(orderId, amount, userId);
        return paymentLink;
    }
}
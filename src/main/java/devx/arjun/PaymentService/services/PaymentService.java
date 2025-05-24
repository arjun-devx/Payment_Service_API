package devx.arjun.PaymentService.services;
import devx.arjun.PaymentService.paymentGateway.PaymentGateway;
import devx.arjun.PaymentService.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private PaymentGateway paymentGateway;

    public String generatePaymentLink(String orderId, double amount, String userId) {
        String paymentLink = paymentGateway.generatePaymentLink(orderId, amount, userId);
        return paymentLink;
    }
}

package devx.arjun.PaymentService.paymentGateway;

import com.stripe.exception.StripeException;
import org.springframework.stereotype.Component;

@Component("phonepePayment")
public class PhonePayGateway implements PaymentGateway {

    @Override
    public String generatePaymentLink(String orderId, long amount, String userId) throws StripeException {

        return null;
    }
}

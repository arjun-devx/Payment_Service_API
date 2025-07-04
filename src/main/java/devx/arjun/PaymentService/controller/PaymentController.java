package devx.arjun.PaymentService.controller;
import com.stripe.exception.StripeException;
import devx.arjun.PaymentService.dto.PaymentLinkReqDTO;
import devx.arjun.PaymentService.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity generatePaymentLink (@RequestBody PaymentLinkReqDTO paymentLinkReqDTO) throws StripeException {
        String paymentLink = paymentService.generatePaymentLink(paymentLinkReqDTO.getOrderId(),
                                                                paymentLinkReqDTO.getAmount(),
                                                                paymentLinkReqDTO.getUserId());
        return ResponseEntity.ok(paymentLink);
    }
}

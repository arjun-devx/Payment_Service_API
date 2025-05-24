package devx.arjun.PaymentService.controller;
import devx.arjun.PaymentService.dto.PaymentLinkReqDTO;
import devx.arjun.PaymentService.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/payment")
public class paymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public ResponseEntity<String> generatePaymentLink (@RequestBody PaymentLinkReqDTO paymentLinkReqDTO) {
        String paymentLink = paymentService.generatePaymentLink(paymentLinkReqDTO.getOrderId(), paymentLinkReqDTO.getAmount(), paymentLinkReqDTO.getUserId());
        return ResponseEntity.ok(paymentLink);
    }
}

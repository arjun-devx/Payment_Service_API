package devx.arjun.PaymentService.paymentGateway;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.model.Price;
import com.stripe.param.PaymentLinkCreateParams;
import com.stripe.param.PriceCreateParams;
import org.springframework.stereotype.Component;

@Component("stripePayment")
public class StripePaymentGateway implements PaymentGateway {

    private String stripeAPIKey = "";

    @Override
    public String generatePaymentLink(String orderId, long amount, String userId) throws StripeException {
        Stripe.apiKey = stripeAPIKey;

        PriceCreateParams priceParams =
                PriceCreateParams.builder()
                        .setCurrency("inr")
                        .setUnitAmount(amount)
                        .setProductData(
                                PriceCreateParams.ProductData.builder()
                                        .setName("ProductName").build()
                        ).build();
        Price price = Price.create(priceParams);

        PaymentLinkCreateParams paymentParams =
                PaymentLinkCreateParams.builder()
                        .addLineItem(
                                PaymentLinkCreateParams.LineItem.builder()
                                        .setPrice(price.getId())
                                        .setQuantity(1L)
                                        .build()
                        )
                        .setAfterCompletion(
                                PaymentLinkCreateParams.AfterCompletion.builder()
                                        .setType(PaymentLinkCreateParams.AfterCompletion.Type.REDIRECT)
                                        .setRedirect(PaymentLinkCreateParams.AfterCompletion.Redirect.builder()
                                            .setUrl("Callback URL")
                                            .build()
                                        ).build()
                        ).build();

        PaymentLink paymentLink = PaymentLink.create(paymentParams);

        return paymentLink.toString();
    }

}

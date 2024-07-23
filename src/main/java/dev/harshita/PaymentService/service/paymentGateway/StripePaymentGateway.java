package dev.harshita.PaymentService.service.paymentGateway;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Primary
public class StripePaymentGateway implements PaymentGateway{
    @Override
    public String createPaymentLink(UUID orderId, long amount) {
        return null;
    }
}

package dev.harshita.PaymentService.service.paymentGateway;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RazorPayPaymentGateway implements PaymentGateway{
    @Override
    public String createPaymentLink(UUID orderId, long amount) {
        return null;
    }
}

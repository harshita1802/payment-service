package dev.harshita.PaymentService.paymentGateway;

import com.stripe.exception.StripeException;

import java.util.UUID;

public interface PaymentGateway {
    String createPaymentLink(UUID orderId, long amount) throws StripeException;
}

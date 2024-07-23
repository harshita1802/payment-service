package dev.harshita.PaymentService.service.paymentGateway;

import java.util.UUID;

public interface PaymentGateway {
    String createPaymentLink(UUID orderId, long amount);
}

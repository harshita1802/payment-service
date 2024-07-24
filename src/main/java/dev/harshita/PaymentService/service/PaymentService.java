package dev.harshita.PaymentService.service;

import com.stripe.exception.StripeException;
import dev.harshita.PaymentService.dto.PaymentLinkRequestDto;

public interface PaymentService {
    String generatePaymentLink(PaymentLinkRequestDto paymentLinkRequestDto) throws StripeException;
}

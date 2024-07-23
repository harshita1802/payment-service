package dev.harshita.PaymentService.service;

import dev.harshita.PaymentService.dto.PaymentLinkRequestDto;

public interface PaymentService {
    String generatePaymentLink(PaymentLinkRequestDto paymentLinkRequestDto);
}

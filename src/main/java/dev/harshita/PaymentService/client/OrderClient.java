package dev.harshita.PaymentService.client;

import dev.harshita.PaymentService.dto.OrderResponseDto;

import java.util.UUID;

public interface OrderClient {

    OrderResponseDto getOrder(UUID orderId);

}

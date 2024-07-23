package dev.harshita.PaymentService.client;

import dev.harshita.PaymentService.dto.OrderResponseDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class OrderClientImpl implements OrderClient{

    @Override
    public OrderResponseDto getOrder(UUID orderId) {
        return null;
    }
}

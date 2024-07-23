package dev.harshita.PaymentService.service;

import dev.harshita.PaymentService.client.OrderClient;
import dev.harshita.PaymentService.client.UserClient;
import dev.harshita.PaymentService.dto.OrderResponseDto;
import dev.harshita.PaymentService.dto.PaymentLinkRequestDto;
import dev.harshita.PaymentService.service.paymentGateway.PaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentGateway paymentGateway;
    @Autowired
    private OrderClient orderServiceClient;
    @Autowired
    private UserClient userServiceClient;

    @Override
    public String generatePaymentLink(PaymentLinkRequestDto paymentLinkRequestDto) {
        UUID orderId = paymentLinkRequestDto.getOrderId();
        OrderResponseDto orderDto = orderServiceClient.getOrder(orderId);
        UserResponseDto userDto = userServiceClient.getUser(orderDto.getUserId());

        return paymentGateway.createPaymentLink(orderId,orderDto.getAmount());
    }
}

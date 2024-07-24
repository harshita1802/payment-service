package dev.harshita.PaymentService.service;

import com.stripe.exception.StripeException;
import dev.harshita.PaymentService.client.OrderClient;
import dev.harshita.PaymentService.client.UserClient;
import dev.harshita.PaymentService.dto.PaymentLinkRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.harshita.PaymentService.paymentGateway.PaymentGateway;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private OrderClient orderServiceClient;
    @Autowired
    private UserClient userServiceClient;
    @Autowired
    private PaymentGateway paymentGateway;

    @Override
    public String generatePaymentLink(PaymentLinkRequestDto paymentLinkRequestDto) throws StripeException {
//        UUID orderId = paymentLinkRequestDto.getOrderId();
//        OrderResponseDto orderDto = orderServiceClient.getOrder(orderId);
//        UserResponseDto userDto = userServiceClient.getUser(orderDto.getUserId());
        return paymentGateway.createPaymentLink(UUID.randomUUID(),30000);
    }
}

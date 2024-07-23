package dev.harshita.PaymentService.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PaymentLinkRequestDto {
    private UUID orderId;
}

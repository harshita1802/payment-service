package dev.harshita.PaymentService.client;

import dev.harshita.PaymentService.service.UserResponseDto;

import java.util.UUID;

public interface UserClient {
    UserResponseDto getUser(UUID userId);

}

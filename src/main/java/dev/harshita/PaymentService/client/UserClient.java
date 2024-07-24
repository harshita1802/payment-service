package dev.harshita.PaymentService.client;

import dev.harshita.PaymentService.dto.UserResponseDto;

import java.util.UUID;

public interface UserClient {
    UserResponseDto getUser(UUID userId);

}

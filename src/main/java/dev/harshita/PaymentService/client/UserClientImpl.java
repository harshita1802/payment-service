package dev.harshita.PaymentService.client;

import dev.harshita.PaymentService.service.UserResponseDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserClientImpl implements UserClient{
    @Override
    public UserResponseDto getUser(UUID userId) {
        return null;
    }
}

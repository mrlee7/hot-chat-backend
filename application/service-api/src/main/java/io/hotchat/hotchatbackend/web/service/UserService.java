package io.hotchat.hotchatbackend.web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final RedisService redisService;

    public String createUserSessionId() {
        String sessionId = String.format("user:session:%s", UUID.randomUUID());
        redisService.saveSession(sessionId);
        return sessionId;
    }
}

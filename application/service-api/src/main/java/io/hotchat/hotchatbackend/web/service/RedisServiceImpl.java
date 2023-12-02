package io.hotchat.hotchatbackend.web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService {

    private final StringRedisTemplate stringRedisTemplate;

    @Override
    public void saveSession(String sessionId) {
        stringRedisTemplate.opsForValue().set(sessionId, "active");
    }
}

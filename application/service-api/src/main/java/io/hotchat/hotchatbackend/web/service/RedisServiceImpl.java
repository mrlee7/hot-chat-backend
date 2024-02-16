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
    public void save(String nickname) {
        stringRedisTemplate.opsForValue().set(nickname, "active");
    }

    @Override
    public Boolean isExist(String nickname) {
        return stringRedisTemplate.hasKey(nickname);
    }
}

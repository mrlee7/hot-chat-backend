package src.main.java.io.hotchat.hotchatbackend.redis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisMessagePublisher {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void publish(final String message) {
        redisTemplate.convertAndSend("chat", message);
    }
}


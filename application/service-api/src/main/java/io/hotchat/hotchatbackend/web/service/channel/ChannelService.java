package io.hotchat.hotchatbackend.web.service.channel;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChannelService {

    private final StringRedisTemplate redisTemplate;
    private final ChannelTopic topic;


    public void sendMessage(String message) {
        redisTemplate.convertAndSend(topic.getTopic(), message);
    }
}

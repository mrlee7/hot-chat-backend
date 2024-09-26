package io.hotchat.hotchatbackend.web.service.chat;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class ChatMessageSubscriber implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] pattern) {
        String channel = new String(message.getChannel());
        String msgBody = new String(message.getBody());
        System.out.println("메시지 수신: " + msgBody + " 채널: " + channel);
    }
}
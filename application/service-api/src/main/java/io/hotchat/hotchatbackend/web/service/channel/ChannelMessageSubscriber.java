package io.hotchat.hotchatbackend.web.service.channel;

import org.springframework.stereotype.Service;

@Service
public class ChannelMessageSubscriber {

    public void receiveMessage(String message) {
        System.out.println("메시지 발행: " + message);
    }
}

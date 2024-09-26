package src.main.java.io.hotchat.hotchatbackend.redis;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RedisMessageSubscriber implements MessageListener {

    @Override
    public void onMessage(final Message message, final byte[] pattern) {
        String messageBody = new String(message.getBody());
        System.out.println("Message received: " + messageBody);
    }
}


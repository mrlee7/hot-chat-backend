package io.hotchat.hotchatbackend.web.service.user;

import io.hotchat.hotchatbackend.web.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final RedisService redisService;

    public void enter(String nickname) {
        if (redisService.isExist(nickname)) {
            throw new RuntimeException("존재하는 유저");
        }
        redisService.save(nickname);
    }
}

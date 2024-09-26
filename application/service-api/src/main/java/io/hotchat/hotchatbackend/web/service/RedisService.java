package io.hotchat.hotchatbackend.web.service;

public interface RedisService {

    void save(String nickname);
    Boolean isExist(String nickname);
}

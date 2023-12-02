package io.hotchat.hotchatbackend.web.service;

public interface RedisService {

    void saveSession(String sessionId);
}

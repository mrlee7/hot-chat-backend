package io.hotchat.hotchatbackend.web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/session-id")
    public ResponseEntity<String> getUserSessionid() {
        String sessionId = userService.createUserSessionId();
        return ResponseEntity.ok(sessionId);
    }
}

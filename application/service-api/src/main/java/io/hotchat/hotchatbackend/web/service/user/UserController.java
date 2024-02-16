package io.hotchat.hotchatbackend.web.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/enter")
    public ResponseEntity<String> getUserSessionid(
        @RequestParam(value = "nickname") String nickname
    ) {
        userService.enter(nickname);
        return ResponseEntity.ok("입장 성공");
    }
}

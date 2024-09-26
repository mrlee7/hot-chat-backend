package io.hotchat.hotchatbackend.web.service.channel;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChannelController {

    private final ChannelService chatService;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        chatService.sendMessage(message);
    }
}
package io.hotchat.hotchatbackend.web.service.chat;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public void sendMessage(@RequestParam String message) {
        chatService.sendMessage(message);
    }
}

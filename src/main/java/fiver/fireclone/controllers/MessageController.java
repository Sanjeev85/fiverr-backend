package fiver.fireclone.controllers;

import org.springframework.web.bind.annotation.*;

import fiver.fireclone.models.Message;
import fiver.fireclone.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        // Implement createMessage logic using messageService
    }

    @GetMapping("/{id}")
    public List<Message> getMessages(@PathVariable String id) {
        // Implement getMessages logic using messageService
    }
}

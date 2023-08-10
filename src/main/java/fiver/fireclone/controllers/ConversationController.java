package fiver.fireclone.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import fiver.fireclone.models.Conversation;
import fiver.fireclone.service.ConversationService;

@RestController
@RequestMapping("/conversations")
public class ConversationController {

    private final ConversationService conversationService;

    public ConversationController(ConversationService conversationService) {
        this.conversationService = conversationService;
    }

    @GetMapping
    public List<Conversation> getConversations() {
        return conversationService.getConversations();
    }

    @PostMapping
    public Conversation createConversation(@RequestBody Conversation conversation) {
        return conversationService.createConversation(conversation);
    }

    @GetMapping("/single/{id}")
    public Conversation getSingleConversation(@PathVariable String id) {
        return conversationService.getSingleConversation(id);
    }

    @PutMapping("/{id}")
    public Conversation updateConversation(@PathVariable String id, @RequestBody Conversation conversation) {
        return conversationService.updateConversation(id, conversation);
    }
}

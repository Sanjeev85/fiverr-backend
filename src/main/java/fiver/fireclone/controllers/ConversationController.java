package fiver.fireclone.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import fiver.fireclone.models.Conversation;
import fiver.fireclone.service.ConversationService;

@RestController
@RequestMapping("/conversations")
public class ConversationController {

    private final ConversationService conversationService;

    @Autowired
    public ConversationController(ConversationService conversationService) {
        this.conversationService = conversationService;
    }

    @GetMapping
    public List<Conversation> getConversations() {
        // Implement getConversations logic using conversationService
    }

    @PostMapping
    public Conversation createConversation(@RequestBody Conversation conversation) {
        // Implement createConversation logic using conversationService
    }

    @GetMapping("/single/{id}")
    public Conversation getSingleConversation(@PathVariable String id) {
        // Implement getSingleConversation logic using conversationService
    }

    @PutMapping("/{id}")
    public Conversation updateConversation(@PathVariable String id, @RequestBody Conversation conversation) {
        // Implement updateConversation logic using conversationService
    }
}

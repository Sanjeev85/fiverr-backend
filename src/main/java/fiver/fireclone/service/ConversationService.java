package fiver.fireclone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fiver.fireclone.models.Conversation;
import fiver.fireclone.repositories.ConversationRepository;

@Service
public class ConversationService {
    private final ConversationRepository conversationRepository;

    public ConversationService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
    }

    public Conversation createConversation(Conversation conversation) {
        return conversationRepository.save(conversation);
    }

    public Conversation getSingleConversation(String id) {
        return conversationRepository.findById(id).orElse(new Conversation());
    }

    public Conversation updateConversation(String id, Conversation conversation) {
        return createConversation(conversation);
    }

    public List<Conversation> getConversations() {
        return conversationRepository.findAll();
    }

}

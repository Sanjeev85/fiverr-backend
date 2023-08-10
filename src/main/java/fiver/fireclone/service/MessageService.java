package fiver.fireclone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fiver.fireclone.models.Message;
import fiver.fireclone.repositories.MessageRepository;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> getMessages(String conversationId) {
        return messageRepository.findByConversationId(conversationId);
    }
}

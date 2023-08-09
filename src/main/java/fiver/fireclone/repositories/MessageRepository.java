package fiver.fireclone.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import fiver.fireclone.models.Message;

public interface MessageRepository extends MongoRepository<Message, String> {
    List<Message> findByConversationId(String conversationId);
    // Add any additional custom queries you need
}

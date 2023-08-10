package fiver.fireclone.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import fiver.fireclone.models.Conversation;

public interface ConversationRepository extends MongoRepository<Conversation, String> {
    // Add any additional custom queries you need
}

package fiver.fireclone.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GigRepository extends MongoRepository<Gig, String> {
    // Add any additional custom queries you need
}

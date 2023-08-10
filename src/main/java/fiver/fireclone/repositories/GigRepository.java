package fiver.fireclone.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fiver.fireclone.models.Gig;

public interface GigRepository extends MongoRepository<Gig, String> {
    // Add any additional custom queries you need
}

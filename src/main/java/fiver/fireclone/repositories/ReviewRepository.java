package fiver.fireclone.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fiver.fireclone.models.Review;

import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findByGigId(String gigId);
    // Add any additional custom queries you need
}

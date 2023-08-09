package fiver.fireclone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import fiver.fireclone.models.Review;
import fiver.fireclone.repositories.ReviewRepository;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public ResponseEntity<String> createReview(Review review) {
        // Implement createReview logic using reviewRepository
        return ResponseEntity.ok("Review created");
    }

    public List<Review> getReviews(String gigId) {
        return reviewRepository.findByGigId(gigId);
    }

    public ResponseEntity<String> deleteReview(String id) {
        // Implement deleteReview logic using reviewRepository
        return ResponseEntity.ok("Review deleted");
    }
}

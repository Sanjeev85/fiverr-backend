package fiver.fireclone.service;

import org.springframework.stereotype.Service;

import fiver.fireclone.models.Review;
import fiver.fireclone.repositories.ReviewRepository;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public String createReview(Review review) {
        Review findReview = reviewRepository.findAll().stream()
                .filter(currReview -> review.getId() == currReview.getId()).toList().get(0);

        if (findReview != null)
            return "You have already created a review";

        return reviewRepository.save(review).toString();
    }

    public List<Review> getReviews(String gigId) {
        return reviewRepository.findByGigId(gigId);
    }

    public String deleteReview(String id) {
        reviewRepository.deleteById(id);
        return "Review Deleted";
    }
}

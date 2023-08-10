package fiver.fireclone.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fiver.fireclone.models.Review;
import fiver.fireclone.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResponseEntity<String> createReview(@RequestBody Review review) {
        String savedMessage = reviewService.createReview(review);
        if (savedMessage.equals("You have already created a review")) {
            ResponseEntity.badRequest().body("Review already created");
        }
        return ResponseEntity.ok(savedMessage);
    }

    @GetMapping("/{gigId}")
    public List<Review> getReviews(@PathVariable String gigId) {
        return reviewService.getReviews(gigId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteReview(@PathVariable String id) {
        var message = reviewService.deleteReview(id);
        return ResponseEntity.ok(message);
    }
}

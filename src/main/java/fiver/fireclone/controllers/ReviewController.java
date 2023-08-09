package fiver.fireclone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fiver.fireclone.models.Review;
import fiver.fireclone.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResponseEntity<String> createReview(@RequestBody Review review) {
        // Implement createReview logic using reviewService
    }

    @GetMapping("/{gigId}")
    public List<Review> getReviews(@PathVariable String gigId) {
        // Implement getReviews logic using reviewService
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteReview(@PathVariable String id) {
        // Implement deleteReview logic using reviewService
    }
}

package org.avi1606.uberprojectreviewservices.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.avi1606.uberprojectreviewservices.model.Review;
import org.avi1606.uberprojectreviewservices.repository.ReviewRepository;
import org.avi1606.uberprojectreviewservices.services.ReviewServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
@AllArgsConstructor
@Slf4j
public class ReviewController {

    private final ReviewRepository reviewRepository;

    @PostMapping("postreview")
    public ResponseEntity<Review> postReview(@RequestBody Review review) {
        try {
            Review savedReview = reviewRepository.save(review);
            return ResponseEntity.ok(savedReview);
        } catch (Exception e) {
            log.error("Error saving review: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("getreview")
    public ResponseEntity<Review> getAllReview() {
        try{
            Review reviews = reviewRepository.findAll();
        }
    }

}

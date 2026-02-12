package org.avi1606.uberprojectreviewservices.services;

import lombok.AllArgsConstructor;
import org.avi1606.uberprojectreviewservices.model.Booking;
import org.avi1606.uberprojectreviewservices.model.Review;
import org.avi1606.uberprojectreviewservices.repository.BookingRepository;
import org.avi1606.uberprojectreviewservices.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewServices implements CommandLineRunner {

    private final ReviewRepository reviewRepository;

    private final BookingRepository bookingRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(" ************* ");
        Review r = Review.builder()
                .content("Amazing ride quality")
                .rating(4.0).build();
        Booking booking = Booking.builder().
                review(r).
                totalDistance(1000).
                build();

        System.out.println(r.getId());
        bookingRepository.save(booking); // This will cascade save the review


        List<Review> reviews = reviewRepository.findAll();

        for (Review review : reviews) {
            System.out.println(review.getContent()); // Fixed: use 'review' not 'r'
        }
    }
}

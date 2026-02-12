package org.avi1606.uberprojectreviewservices.repository;

import org.avi1606.uberprojectreviewservices.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}

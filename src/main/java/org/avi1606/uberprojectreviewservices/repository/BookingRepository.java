package org.avi1606.uberprojectreviewservices.repository;

import org.avi1606.uberprojectreviewservices.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}

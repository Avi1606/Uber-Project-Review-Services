package org.avi1606.uberprojectreviewservices.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseModel{

    @OneToOne(cascade = CascadeType.ALL)
    private Review review;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    private Timestamp pickupTime;

    private Timestamp dropOffTime;

    private Integer totalDistance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;
}

package org.avi1606.uberprojectreviewservices.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class PassangerReview extends Review{

    private String passangerName;
}

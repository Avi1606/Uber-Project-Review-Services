package org.avi1606.uberprojectreviewservices.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import javax.swing.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class DriverReview extends Review{

    private String driverName;
}

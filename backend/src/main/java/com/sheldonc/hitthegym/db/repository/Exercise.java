package com.sheldonc.hitthegym.db.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Global collection of exercises that can be used
 */
@Entity
public class Exercise {

    @Id
    Long id;

    String name;

    String description;

    String muscleGroup;

}

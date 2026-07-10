package com.sheldonc.hitthegym.db.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Session {

    @Id
    User user;

    @Id
    Long id;

    Exercise[] exercises;
}

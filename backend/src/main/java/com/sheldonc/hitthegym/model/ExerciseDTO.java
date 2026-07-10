package com.sheldonc.hitthegym.model;

public record ExerciseDTO(
        Long id,
        String name,
        String description,
        String muscleGroup) {

}

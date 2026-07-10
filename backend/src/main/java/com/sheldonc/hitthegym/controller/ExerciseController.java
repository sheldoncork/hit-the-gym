package com.sheldonc.hitthegym.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheldonc.hitthegym.model.ExerciseDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping
    public ExerciseDTO getExercise() {
        return new ExerciseDTO(1L, "Bench", "Push bar", "chest");
    }
}

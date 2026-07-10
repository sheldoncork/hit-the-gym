package com.sheldonc.hitthegym.controller;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheldonc.hitthegym.model.ExerciseDTO;
import com.sheldonc.hitthegym.model.UserRequest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    // @PostMapping("/user")
    // public ProblemDetail createUser(UserRequest user) {
    // var response = userService.createUser(user);

    // if (response) {
    // return ProblemDetail.forStatus(201);
    // } else {
    // return ProblemDetail.forStatus(400);
    // }
    // }
}

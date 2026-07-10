package com.sheldonc.hitthegym.controller;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheldonc.hitthegym.db.repository.User;
import com.sheldonc.hitthegym.model.UserRequest;
import com.sheldonc.hitthegym.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/user")
    public ProblemDetail createUser(UserRequest user) {
        var response = userService.createUser(user);

        if (response) {
            return ProblemDetail.forStatus(201);
        } else {
            return ProblemDetail.forStatus(400);
        }
    }
}

package com.example.uni_project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activities")
public class ActivitiesController {

    @GetMapping
    public String info() {
        return "Activities are not available yet";
    }
}

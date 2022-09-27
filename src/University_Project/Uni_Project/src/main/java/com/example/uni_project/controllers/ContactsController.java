package com.example.uni_project.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

    @GetMapping
    public String info() {
        return "Contacts will be imported shortly after the project is done";
    }
}

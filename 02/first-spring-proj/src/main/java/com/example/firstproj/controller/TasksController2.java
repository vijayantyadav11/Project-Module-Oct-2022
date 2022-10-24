package com.example.firstproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TasksController2 {

    @GetMapping("/abc")
    public String print() {
        return "Controller2";
    }
}

package com.example.matchingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/meet")
public class MeetController {
    @GetMapping("")
    public String index() {
        return "meet/meet";
    }
}
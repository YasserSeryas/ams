package com.sip.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/info")
    public String info() {
        return "info";
    }

    @GetMapping("/details")

    public String details() {
        return "details";
    }
}

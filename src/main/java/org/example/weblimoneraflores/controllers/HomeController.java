package org.example.quizzproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "inicio"; // Apunta al archivo `index.html` en `templates`
    }
}



package org.example.weblimoneraflores.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/producto")
    public String producto() {
        return "producto"; // Devuelve el archivo producto.html
    }
}
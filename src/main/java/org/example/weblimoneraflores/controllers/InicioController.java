package org.example.weblimoneraflores.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Controlador para acceder a las vistas HTML
@Controller
public class InicioController {

    @GetMapping("/")
    public String incio() {
        return "inicio"; // Apunta al archivo `inicio.html` en `templates`
    }
}



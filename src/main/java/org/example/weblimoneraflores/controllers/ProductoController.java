package org.example.weblimoneraflores.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Controlador para acceder a las vistas HTML
@Controller
public class ProductoController {

    @GetMapping("/producto")
    public String producto() {
        return "producto"; // Apunta al archivo `producto.html` en `templates`
    }
}
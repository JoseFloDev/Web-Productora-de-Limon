package org.example.weblimoneraflores.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Controlador para acceder a las vistas HTML
@Controller
public class ContactoController {

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto"; // Apunta al archivo `contacto.html` en `templates`
    }
}

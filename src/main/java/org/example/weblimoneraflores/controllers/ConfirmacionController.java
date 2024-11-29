package org.example.weblimoneraflores.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Controlador para acceder a las vistas HTML
@Controller
public class ConfirmacionController {

    @GetMapping("/confirmacion")
    public String confirmacion() {
        return "confirmacion"; // Apunta al archivo `confirmacion.html` en `templates`
    }

}

package org.example.weblimoneraflores.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfimacionController {
    @GetMapping("/confirmacion")
    public String confirmacion() {
        return "confirmacion"; // Apunta al archivo `contacto.html` en `templates`
    }

}

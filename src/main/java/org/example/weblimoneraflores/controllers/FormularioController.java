package org.example.weblimoneraflores.controllers;

import org.example.weblimoneraflores.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/contacto")
public class FormularioController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<String> EnviarMensaje(@RequestParam String nombre, @RequestParam String email, @RequestParam String mensaje) {

        // Preparar el correo
        String destinatario = "limonerafloresmx@gmail.com";
        String remitente = "posiblecliente1@gmail.com";
        String asunto = "Nuevo mensaje de contacto";
        String contenido = "Nombre: " + nombre + "\nEmail: " + email + "\nMensaje: " + mensaje;


        emailService.enviarCorreo(destinatario, remitente, asunto, contenido);

        return ResponseEntity.ok("Contacto enviado exitosamente!");
    }
}

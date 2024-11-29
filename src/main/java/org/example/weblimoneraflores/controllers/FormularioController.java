package org.example.weblimoneraflores.controllers;

import org.example.weblimoneraflores.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Controlador para Enviar el mensaje utilizando el Formulario
@Controller
@RequestMapping("/api/contacto")
public class FormularioController {

    @Autowired
    private EmailService emailService;

    //Se obtinen los datos escritos en el formulario
    @PostMapping
    public String EnviarMensaje(@RequestParam String nombre, @RequestParam String email, @RequestParam String mensaje) {

        // Preparar el correo
        String destinatario = "limonerafloresmx@gmail.com";
        String remitente = "posiblecliente1@gmail.com";
        String asunto = "Nuevo mensaje de contacto";
        String contenido = "Nombre: " + nombre + "\nEmail: " + email + "\nMensaje: " + mensaje;


        //Se utiliza el servicio que creamos para enviar el mensaje por correo electronico
        emailService.enviarCorreo(destinatario, remitente, asunto, contenido);

        //Nos manda a la pagina HTML de confirmacion
        return "confirmacion";
    }
}

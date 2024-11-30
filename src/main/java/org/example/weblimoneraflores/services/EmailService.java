package org.example.weblimoneraflores.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mail;
    @Autowired
    private JavaMailSenderImpl mailSender;

    //Metodo para enviar los mensajes por correo electronico
    public void enviarCorreo(String destinatario, String remitente, String asunto, String contenido) {
        SimpleMailMessage email = new SimpleMailMessage();

        //Se define l informacion necesaria de nuestro objeto email
        email.setTo(destinatario);
        email.setFrom(remitente);
        email.setSubject(asunto);
        email.setText(contenido);

        //Se envia nuestro objeto email
        mail.send(email);
    }
}


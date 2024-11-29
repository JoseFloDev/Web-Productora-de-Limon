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

    public void enviarCorreo(String destinatario, String remitente, String asunto, String contenido) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(destinatario);
        email.setFrom(remitente);
        email.setSubject(asunto);
        email.setText(contenido);



        mail.send(email);
    }
}


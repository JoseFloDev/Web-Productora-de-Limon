package org.example.weblimoneraflores.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

//Configuracion para el envio de mensajes por correo electronico
@Configuration
public class MailConfig {

    private final JavaMailSender mailSender;

    public MailConfig(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

}

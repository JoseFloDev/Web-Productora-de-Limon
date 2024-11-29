package org.example.weblimoneraflores.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    private final JavaMailSender mailSender;

    public MailConfig(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

}

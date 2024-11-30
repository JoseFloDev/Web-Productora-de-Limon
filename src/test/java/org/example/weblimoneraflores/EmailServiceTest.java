package org.example.weblimoneraflores;

import org.example.weblimoneraflores.services.EmailService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailServiceTest {

    @Mock
    private JavaMailSender mockMailSender;

    @InjectMocks
    private EmailService emailService;

    public EmailServiceTest() {
        // Inicializar los mocks antes de ejecutar las pruebas
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testEnviarCorreo() {
        // Datos de prueba
        String destinatario = "destinatario@test.com";
        String remitente = "remitente@test.com";
        String asunto = "Asunto de prueba";
        String contenido = "Contenido del mensaje de prueba";

        // Ejecutar el método que queremos probar
        emailService.enviarCorreo(destinatario, remitente, asunto, contenido);

        // Capturar el argumento pasado al método `send`
        ArgumentCaptor<SimpleMailMessage> captor = ArgumentCaptor.forClass(SimpleMailMessage.class);
        verify(mockMailSender, times(1)).send(captor.capture());

        // Verificar los valores del mensaje capturado
        SimpleMailMessage capturedMessage = captor.getValue();
        assertNotNull(capturedMessage);
        assertEquals(destinatario, capturedMessage.getTo()[0]);
        assertEquals(remitente, capturedMessage.getFrom());
        assertEquals(asunto, capturedMessage.getSubject());
        assertEquals(contenido, capturedMessage.getText());
    }
}

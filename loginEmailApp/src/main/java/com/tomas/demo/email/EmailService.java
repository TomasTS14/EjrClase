package com.tomas.demo.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService implements  EmailSender{
    //no estoy seguro de como loggea contenido nuevo siendo que tiene el final.
    //Le paso la clase misma sobre la que hará login. Imagino que funciona como un singleton por el metodo.
    private final static Logger LOGGER = LoggerFactory.getLogger(EmailService.class);
    private JavaMailSender mailSender;

    @Async  //async debe ser para que no se quede toda la app trabada en caso de que se haga una llamada a este metodo y tarde
    @Override
    public void send(String to,String text) {
        //los MimeMessage tienen que hacerse en try catch
        try{
            //simula un mensaje enviado, para estructurarlo y darle valores se puede usar un helper
            //al helper se le senala a que mimemessage ayuda y con que codificacion trabaja.
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,"utf-8");
            helper.setText(text);
            helper.setTo(to);
            helper.setFrom("compañia@email.com");
            helper.setSubject("Confirm your email");
            mailSender.send(mimeMessage);

        }catch (MessagingException e){
            //esto guarda en el logger el string y el error
            LOGGER.error("failed to send email",e);
            //Pero no es eso lo que queremos mostrar a cliente, asi que soltamos otra excepcion que si vea.
            //(lo ve por la config de application.properties
            throw new IllegalStateException("failed to send email");


        }

    }
}

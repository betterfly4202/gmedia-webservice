package com.gmedia.webservice.common;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 * Created by betterFLY on 2018. 4. 25.
 * Github : http://github.com/betterfly88
 */

@Component
@PropertySource("classpath:properties/connection.properties")
public class MailService {
    org.slf4j.Logger logger = LoggerFactory.getLogger(MailService.class);

    @Autowired
    JavaMailSender javaMailSender;

    @Value("${mail.smtp.mail}")
    String form;

    public boolean sendMail(String to, String subject, String content){
        MimeMessagePreparator preparator = new MimeMessagePreparator(){
            public void prepare(MimeMessage mimeMessage) throws Exception{
                mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
                mimeMessage.setFrom(new InternetAddress(form));
                mimeMessage.setSubject(subject);
                mimeMessage.setText(content, "utf-8", "html");
            }
        };

        try
        {
            javaMailSender.send(preparator);
            return true;
        }
        catch (MailException me)
        {
            logger.error("MailException", me);
            return false;
        }
    }

}

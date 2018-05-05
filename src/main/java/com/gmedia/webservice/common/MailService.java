package com.gmedia.webservice.common;

import com.gmedia.webservice.mail.vo.MailVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Properties;

/**
 * Created by betterFLY on 2018. 5. 1.
 * Github : http://github.com/betterfly88
 */

@Service
@Configuration
@PropertySource(value="classpath:properties/connection.properties")
public class MailService {
    @Value("${mail.smtp.host}")
    String host;

    @Value("${mail.smtp.port}")
    String port;

    @Value("${mail.smtp.user}")
    String user;

    @Value("${mail.smtp.pass}")
    String pass;


    private Session mailAuthCheck(){
        Session session = Session.getDefaultInstance(getMailProperties(), new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });

        return session;
    }

    private Properties getMailProperties(){
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.ssl.trust", host);
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.port", port);
        properties.setProperty("mail.smtp.socketFactory.port", port);
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        return properties;
    }

    private Address[] receiverAddressList(List<String> arr) throws AddressException {
        InternetAddress [] receiverList = null;

        receiverList = new InternetAddress[arr.size()];

        for(int i=0; i<arr.size(); i++){
            receiverList[i] = new InternetAddress(arr.get(i));
        }

        return receiverList;
    }

    public boolean sendMail(MailVO vo){
        try{
            MimeMessage message = new MimeMessage(this.mailAuthCheck());
            message.setFrom(new InternetAddress(user));
//            message.addRecipient(Message.RecipientType.TO, receiverList);
            message.setRecipients(Message.RecipientType.TO, receiverAddressList(vo.getInternetAddress()));
            message.setSubject(vo.getSubject());
            message.setText(vo.getContents());

            Transport.send(message);

            return true;
        }catch (AddressException e){
            e.printStackTrace();
            return false;
        }catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }

    }
}

package com.gmedia.webservice.common;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created by betterFLY on 2018. 4. 29.
 * Github : http://github.com/betterfly88
 */

public class MailEnvironment {

    public static void smtp(
            String host, String port, String user, String password,
            String senderMail, String readerMail,
            String subject, String content
    ) throws AddressException, MessagingException {
        Properties props = new Properties();

        // smtp에 필요한 인증부
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", host);
        props.put("mail.smtp.auth", "true");

        // 호스트 / 포트
        props.put("mail.smtp.host", host);
        if (port != null){
            props.put("mail.smtp.port", port);
            props.put("mail.smtp.socketFactory.port", port);
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        }

        // 인증을 포함한 메시지 만들기
        Message msg = new MimeMessage(Session.getInstance(props, new Authenticator()
        {
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(user, password);
            }
        }));

        msg.setFrom(new InternetAddress(senderMail));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(readerMail));
        msg.setSubject(subject);
        msg.setContent(content, "text/html;charset=UTF-8");
        msg.setSentDate(new Date());
        Transport.send(msg);
    }
}

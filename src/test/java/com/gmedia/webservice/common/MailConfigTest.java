package com.gmedia.webservice.common;

import org.junit.Test;

/**
 * Created by betterFLY on 2018. 4. 27.
 * Github : http://github.com/betterfly88
 */

public class MailConfigTest {


    private MailConfig mailConfig;

    @Test
    public void 메일설정확인(){
        mailConfig = new MailConfig();

//        mailConfig.getMailSender();
        System.out.println(mailConfig.host);
        System.out.println(mailConfig.port);
        System.out.println(mailConfig.user);
        System.out.println(mailConfig.password);
    }
}

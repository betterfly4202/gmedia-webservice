package com.gmedia.webservice.mail;

import com.gmedia.webservice.common.MailConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by betterFLY on 2018. 4. 29.
 * Github : http://github.com/betterfly88
 */

public class MailConfigTest {
    @Autowired
    MailConfig config;

    @Test
    public void test(){
        config = new MailConfig();
        config.getMailSender();
//        System.out.println(config.);
    }
}

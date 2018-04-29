package com.gmedia.webservice.mail;

import com.gmedia.webservice.common.MailConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by betterFLY on 2018. 4. 29.
 * Github : http://github.com/betterfly88
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailConfigTest {
//    @Autowired
//    MailConfig config;

    @Autowired
    private com.gmedia.webservice.common.Test test;

//    @Test
//    public void test(){
//        config = new MailConfig();
//        System.out.println(config.setHost());
//        config.getMailSender();
////        System.out.println(config.);
//
//    }

    @Test
    public void aaaa(){
        System.out.println(test.getKey());
    }
}
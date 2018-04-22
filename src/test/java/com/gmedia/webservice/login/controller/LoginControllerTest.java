package com.gmedia.webservice.login.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by betterFLY on 2018. 4. 22.
 * Github : http://github.com/betterfly88
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LoginControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void 로그인페이지_로딩(){
        //when
        String object = this.testRestTemplate.getForObject("/",String.class);

        //tehn
        assertThat(object).contains("delivery service");
    }


}

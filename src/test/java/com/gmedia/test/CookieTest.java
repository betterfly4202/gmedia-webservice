package com.gmedia.test;

import org.junit.Test;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by betterFLY on 2018. 6. 11.
 * Github : http://github.com/betterfly88
 */

public class CookieTest {

    @Test
    public void 쿠키만들기(){

        Map<String, Object> map = new HashMap<>();
        map.put("value","1231aadfddd");

        Cookie cookies = new Cookie("loginInfo","zzz");
    }
}

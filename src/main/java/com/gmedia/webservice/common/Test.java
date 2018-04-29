package com.gmedia.webservice.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by betterFLY on 2018. 4. 30.
 * Github : http://github.com/betterfly88
 */

@Component
public class Test {

    @Value("${key}")
    private String key;
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
}

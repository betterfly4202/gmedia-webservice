package com.gmedia.webservice.common;

import org.joda.time.DateTime;
import org.junit.Test;

/**
 * Created by betterFLY on 2018. 4. 24.
 * Github : http://github.com/betterfly88
 */


public class UtilsTest {


    @Test
    public void 조다타임(){
        DateTime dateTime = new DateTime();
        String today  = dateTime.toString("yyyy년 MM월 dd일");
        System.out.println(today);


    }
}

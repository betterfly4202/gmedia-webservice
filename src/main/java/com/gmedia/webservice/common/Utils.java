package com.gmedia.webservice.common;

import org.joda.time.DateTime;

/**
 * Created by betterFLY on 2018. 4. 24.
 * Github : http://github.com/betterfly88
 */

public class Utils {

    public static String getToday(){
        DateTime dateTime = new DateTime();
        String today  = dateTime.toString("yyyy년 MM월 dd일");

        return today;
    }
}

package com.gmedia.test;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by betterFLY on 2018. 5. 6.
 * Github : http://github.com/betterfly88
 */

public class CallByTest {
    private int a;
    private int b;

    @Before
    public void setup(){
        this.a = 10;
        this.b = 20;
    }


    @Test
    public int swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        return b;
    }

}

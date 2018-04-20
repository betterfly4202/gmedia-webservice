package com.gmedia.webservice.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by betterFLY on 2018. 4. 21.
 * Github : http://github.com/betterfly88
 */

@RestController
public class MainController {

    @RequestMapping(value = "/main")
    public String index(){
        return "Hello World";
    }
}

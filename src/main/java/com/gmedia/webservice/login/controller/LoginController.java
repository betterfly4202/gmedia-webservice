package com.gmedia.webservice.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by betterFLY on 2018. 4. 21.
 * Github : http://github.com/betterfly88
 */

@Controller
public class LoginController {

    @GetMapping(value = "/")
    public String mainIndex(Model model){
        model.addAttribute("name","효자손개발자");

        return "login";
    }
}

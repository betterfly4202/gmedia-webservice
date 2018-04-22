package com.gmedia.webservice.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by betterFLY on 2018. 4. 21.
 * Github : http://github.com/betterfly88
 */

@Controller
public class IndexController {

    @GetMapping(value = "/index")
    public String mainIndex(Model model){
        model.addAttribute("name","효자손개발자");

        return "index";
    }
}

package com.gmedia.webservice.mail.controller;

import com.gmedia.webservice.common.MailService;
import com.gmedia.webservice.mail.dao.MainDao;
import com.gmedia.webservice.mail.entity.MainEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by betterFLY on 2018. 4. 21.
 * Github : http://github.com/betterfly88
 */

@RestController
@Controller
public class MailController {

    @Autowired
    private MainDao dao;

    @GetMapping("/mail")
    public ModelAndView mailTemplate(){
        ModelAndView mav = new ModelAndView("mail/mail_template");

        return mav;
    }

    @GetMapping("/add")
    public MainEntity mainAdd(MainEntity entity){
        MainEntity ent = dao.save(entity);

        return ent;
    }

    @GetMapping("/list")
    public List<MainEntity> mainList(){
        List<MainEntity> list = dao.findAll();

        return list;
    }

    @Autowired
    MailService mailService;

    @GetMapping("/send/mail")
    public boolean sendMail(){
        boolean isSend = mailService.sendMail("dlcnddlf88@naver.com","제목", "내용이 거다");

        return isSend;
    }
}

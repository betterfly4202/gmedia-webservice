package com.gmedia.webservice.mail.controller;

import com.gmedia.webservice.common.MailService;
import com.gmedia.webservice.mail.dao.MainDao;
import com.gmedia.webservice.mail.entity.MainEntity;
import com.gmedia.webservice.mail.vo.MailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;


/**
 * Created by betterFLY on 2018. 4. 21.
 * Github : http://github.com/betterfly88
 */

@Controller
public class MailController {

    @Autowired
    private MainDao dao;

    @Autowired
    private MailService mailService;

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

    @PostMapping("/sender")
    public @ResponseBody String mailSenderService(MailVO vo){
        boolean isSend = mailService.sendMail(vo);

        if(isSend){
            return "발송 성공";
        }else{
            return "발송 실패";
        }
    }

}

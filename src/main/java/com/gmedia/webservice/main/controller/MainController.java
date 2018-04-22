package com.gmedia.webservice.main.controller;

import com.gmedia.webservice.main.dao.MainDao;
import com.gmedia.webservice.main.entity.MainEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by betterFLY on 2018. 4. 21.
 * Github : http://github.com/betterfly88
 */

@RestController
public class MainController {

    @Autowired
    private MainDao dao;

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
}

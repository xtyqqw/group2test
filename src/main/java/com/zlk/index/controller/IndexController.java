package com.zlk.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "/indexcontroller")
    public String findIndex(){
        return "userindex";
    }
}

package com.deepak.Receipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String index(Model model){
        return "index";
    }

}

package com.example3.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class YjController {

    @RequestMapping("/")
    public  String mian(Model model){

        return "main";
    }
}

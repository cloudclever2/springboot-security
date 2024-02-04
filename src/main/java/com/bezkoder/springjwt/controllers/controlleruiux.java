package com.bezkoder.springjwt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/giaodien/")
public class controlleruiux {

    @RequestMapping("login")
    public String index() {
        return "index";
    }
}

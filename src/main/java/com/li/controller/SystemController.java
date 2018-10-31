package com.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/10/31.
 */
@Controller
@RequestMapping("/sys")
public class SystemController {


    @GetMapping(value = "/home")
    public String home (Model model) {
        model.addAttribute("hello" , "hi 你好");
        return "home";
    }
}

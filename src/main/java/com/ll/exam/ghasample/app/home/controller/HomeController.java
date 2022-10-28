package com.ll.exam.ghasample.app.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String showMain(HttpServletRequest req) {
        return "IP : " + req.getRemoteAddr();
    }
}

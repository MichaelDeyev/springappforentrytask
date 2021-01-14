package com.deyevma.springappforentrytask.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Value("${spring.application.name}") // welcome message
    String appName;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("appName", appName);
        return "home";
    }
}

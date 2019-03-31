package com.mackittipat.tagmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Home");
        model.addAttribute("content", "Hello this is home page");
        return "layout";
    }

    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("pageTitle", "User");
        model.addAttribute("content", "Hello this is user page");
        return "layout";
    }

    @GetMapping("/product")
    public String product(Model model) {
        model.addAttribute("pageTitle", "Product");
        model.addAttribute("content", "Hello this is product page");
        return "layout";
    }
}

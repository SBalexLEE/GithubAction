package com.bfs.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutController {

    // Same logic as about2
    @RequestMapping(value = "/about") //localhost:8080/about
    public ModelAndView aboutModelView(Model model) {
        model.addAttribute("interests", "asdfghjklzxcvbnm");
        return new ModelAndView("about");
    }

    // Same logic as about
    @GetMapping(value = "/about2") //localhost:8080/about2
    public String aboutModelView2(Model model) {
        model.addAttribute("interests", "badminton, drawing, game dev, cooking!");
        model.addAttribute("food", "ramen");
        model.addAttribute("abc", "123");
        return "about";
    }
}

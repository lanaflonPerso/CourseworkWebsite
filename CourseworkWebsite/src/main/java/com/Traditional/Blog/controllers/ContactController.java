package com.Traditional.Blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    @RequestMapping(value = "/contact")
    public ModelAndView contact(){
        return new ModelAndView("contact");
    }
}
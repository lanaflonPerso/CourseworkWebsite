package com.Traditional.Blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AbortionController {

    @RequestMapping(value = "/abortion")
    public ModelAndView abortion(){
        return new ModelAndView("abortion");
    }
}
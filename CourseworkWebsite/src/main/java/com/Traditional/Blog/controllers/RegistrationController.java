package com.Traditional.Blog.controllers;

import com.Traditional.Blog.domain.RegisterUser;
import com.Traditional.Blog.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {


    private RegistrationService registrationService;

    @Autowired
    public RegistrationController (RegistrationService registrationService){
        this.registrationService = registrationService;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegistration(){
        RegisterUser registerUser = new RegisterUser();
        return new ModelAndView("register", "user", registerUser);
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(RegisterUser registerUser) {
        registerUser.setEnabled(Boolean.TRUE);
        registerUser.setAuthority("ROLE_USER");
        registrationService.addUser(registerUser);
        return "redirect:/users";
    }
}
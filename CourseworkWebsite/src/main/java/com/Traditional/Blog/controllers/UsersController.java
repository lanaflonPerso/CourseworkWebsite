package com.Traditional.Blog.controllers;

import com.Traditional.Blog.domain.CollatedUser;
import com.Traditional.Blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class UsersController {
    private UsersController usersController;
    private UserService userService;

    @Autowired
    public UsersController(UsersController usersController) {
        this.usersController = usersController;
    }

    @RequestMapping
    public ModelAndView users(){
        return new ModelAndView("users");
    }

    @RequestMapping(value = "/users")
    public ModelAndView showProfiles() {
        //Retrieves the email address of the currently logged in user.
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        String password = SecurityContextHolder.getContext().getAuthentication().getName();

        CollatedUser user = userService.getProfile(userName, email, password);
        return new ModelAndView("users", "collatedUser", user);
    }
}


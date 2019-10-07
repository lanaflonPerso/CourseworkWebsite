package com.Traditional.Blog.domain;

import java.nio.file.attribute.UserPrincipal;

public class RegisterUserPrincipal implements UserPrincipal {
    private RegisterUser registerUser;
    public RegisterUserPrincipal(RegisterUser registerUser){
        this.registerUser = registerUser;
    }
    @Override
    public String getName(){
        return registerUser.getUserName();

    }
}

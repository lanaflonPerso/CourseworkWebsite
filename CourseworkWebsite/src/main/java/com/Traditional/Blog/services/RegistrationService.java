package com.Traditional.Blog.services;
import com.Traditional.Blog.domain.RegisterUser;

import java.util.List;
public interface RegistrationService {
        List<RegisterUser> getUsers();
        void addUser(RegisterUser registerUser);
        RegisterUser getUser();
        int getNumberOfUsers();


}

package com.Traditional.Blog.services;
import com.Traditional.Blog.domain.CollatedUser;

public interface UserService {
    CollatedUser getProfile(String userName, String email , String password);
}

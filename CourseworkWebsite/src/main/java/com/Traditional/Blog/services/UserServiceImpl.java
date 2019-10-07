package com.Traditional.Blog.services;
import com.Traditional.Blog.domain.CollatedUser;
import com.Traditional.Blog.dao.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    RegisterRepository registerRepository;



    @Autowired
    public UserServiceImpl(RegisterRepository registerRepository){
        this.registerRepository = registerRepository;
    }
    @Override
    public CollatedUser getProfile(String userName, String email, String password) {

        CollatedUser user = new CollatedUser();
        return user;
    }
}

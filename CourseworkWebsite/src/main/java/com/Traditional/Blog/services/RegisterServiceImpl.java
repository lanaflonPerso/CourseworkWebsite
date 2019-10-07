package com.Traditional.Blog.services;

import com.Traditional.Blog.dao.RegisterRepository;

import com.Traditional.Blog.domain.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegisterServiceImpl implements RegistrationService {
    private RegisterRepository registerRepository;
    private RegisterUser registerUser;


    @Autowired
    public RegisterServiceImpl(RegisterRepository registerRepository){
        this.registerRepository = registerRepository;

    }



    public List<RegisterUser> getUsers(){
        return registerRepository.findAll();
    }
    @Override
    public void addUser(RegisterUser registerUser){
        this.registerUser = registerUser;

        registerRepository.save(registerUser);
    }
    @Override
    public RegisterUser getUser(){
        return registerUser;
    }
    @Override
    public int getNumberOfUsers(){
        return (int)registerRepository.count();
    }


}

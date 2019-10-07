package com.Traditional.Blog.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegisterUser {

    private String userName;
    private String email;
    private String password;
    @Id
    private Boolean enabled;
    private String authority;

    public RegisterUser(){

    }


    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getUserName () {
        return userName;
    }

    public void setUserName (String userName){
        this.userName = userName;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password){
        this.password = password;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email){
        this.email = email;
    }


}

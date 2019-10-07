package com.Traditional.Blog.dao;
import com.Traditional.Blog.domain.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



    @Repository
    public interface RegisterRepository extends JpaRepository<RegisterUser, String> {

        }

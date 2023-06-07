package com.example.springboot02.controller;

import com.example.springboot02.entity.Admin;
import com.example.springboot02.entity.Student;
import com.example.springboot02.mapper.AdminMapper;
import com.example.springboot02.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    AdminMapper adminMapper;

    @GetMapping("/loginAdmin")
    public List<Admin> getAdmin(){
        return adminMapper.selectList(null);
    }


}

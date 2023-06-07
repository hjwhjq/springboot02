package com.example.springboot02.controller;

import com.example.springboot02.entity.Admin;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @RequestMapping(value = "/getSomething",method = RequestMethod.GET)
    public String getSomething(){
        return "getSomething";
    }
    @GetMapping(value = "/login")
    public String getUser(@RequestParam(value = "nickname",required = false) String name,String pwd){
        if("123".equals(name)&&"123".equals(pwd)){
            return "登陆成功";
        }
        else
            return "111";
    }

    @PostMapping("/showUser")
    public String postUser(String username,String password){
        System.out.println(username);
        System.out.println(password);
        return "postUser成功";
    }


    @PostMapping(value = "/show")
    public String showMsg(String name,String gender){
        return "输入的信息是："+name+"性别为："+gender;
    }
    @GetMapping("/add")
    public String addUser(String username, String password) {
        return "用户添加成功!"+username+"--"+password;
    }
    @PostMapping("/post01")
    public String getUser(@RequestBody Admin user){
        System.out.println(user);
        return "getUser成功";
    }
}

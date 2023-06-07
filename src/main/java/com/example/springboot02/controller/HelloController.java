package com.example.springboot02.controller;

// 导入SpringBoot框架中用于处理Web请求的注解
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// 导入SpringBoot框架中用于定义RESTful Web服务的注解
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //注解，表示一个RESTful Web服务类
public class HelloController { // 定义类
    @RequestMapping(value = "/hello",method = RequestMethod.GET) //注解，表示处理对根路径"/"的HTTP GET请求
    /*@GetMapping("/hello")//等价于上一行*/
    public String hello(String name,String age){ //方法，返回值为String类型
        System.out.println(age);
        return "第1个SpringBoot程序是谁写的："+name+"年龄为："+age; // 方法体，返回一个字符串
    }
}


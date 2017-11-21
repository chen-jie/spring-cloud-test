package com.maxrumo.serviceribbon.controller;

import com.maxrumo.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @Autowired
    HelloService helloService;

    @RequestMapping("hi")
    public String sayHi(String name){
        return helloService.hiService(name);
    }
}

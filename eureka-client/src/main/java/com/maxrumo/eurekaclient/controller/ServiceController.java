package com.maxrumo.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Value("${server.port}")
    String port;
    @RequestMapping("hi")
    public String sayHi(String name){
        return String.format("hi %s,I am from port:%s",name,port);
    }
}

package com.docker.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @User: JackieChan
 * @Date: 2019/9/9
 * @Time: 18:01
 * @Reserved: ht
 * @Description: TODO
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String getHelloWorld(){
        System.out.println("hello world");
        return "hello world";
    }
}

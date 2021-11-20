package com.jackey.wikistudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world122";
    }

    @PostMapping("/hello/post")
    public String hello(String name) {
        return "hello world! post method" + name;
    }

}

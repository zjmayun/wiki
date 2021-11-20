package com.jackey.wikistudy.controller;

import com.jackey.wikistudy.domain.Test;
import com.jackey.wikistudy.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/list")
    public List<Test> list() {
        return demoService.list();
    }

}

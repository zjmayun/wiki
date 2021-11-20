package com.jackey.wikistudy.service;

import com.jackey.wikistudy.domain.Test;
import com.jackey.wikistudy.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.selectByExample(null);
    }

}

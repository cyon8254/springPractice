package com.example.ex03.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SampleServiceTest {

    @Autowired
    SampleService sampleService;

    @Test
    public void doAddTest(){
        log.info("result: " + sampleService.doAdd("1", "3"));
    }

}





















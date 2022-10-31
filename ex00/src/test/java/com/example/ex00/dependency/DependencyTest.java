package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j // log 출력 되게 하는
public class DependencyTest {
    @Autowired // 주입 해줘
    private Coding coding;

    @Autowired
    private Restaurant restaurant;

    @Test // 이 메소드를 단위테스트로 돌려라
    public void dependencyTest(){
        log.info(coding+"");
        log.info(restaurant+"");
    }
}

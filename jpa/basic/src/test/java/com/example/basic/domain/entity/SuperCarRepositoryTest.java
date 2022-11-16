package com.example.basic.domain.entity;

import com.example.basic.repository.SuperCarRepository;
import com.example.basic.type.SuperCarBrand;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(false)
public class SuperCarRepositoryTest {
    @Autowired
    private SuperCarRepository superCarRepository;

    @Test
    public void saveTest() {
        SuperCar superCar1 = new SuperCar();
        SuperCar superCar2 = new SuperCar();
        LocalDateTime superCarReleaseDate1 = LocalDateTime.of(2022, 11, 16, 0, 0);
        LocalDateTime superCarReleaseDate2 = LocalDateTime.of(1997, 12, 04, 0, 0);
        superCar1.create(SuperCarBrand.BENTLEY, "yellow", "붕붕", 3000000L, superCarReleaseDate1);
        superCar2.create(SuperCarBrand.LAMBORGHINI, "blue", "타요", 500000L, superCarReleaseDate2);
        log.info("saved superCar: " + superCarRepository.save(superCar1));
        log.info("saved superCar: " + superCarRepository.save(superCar2));
    }

    @Test
    public void deleteBySuperCarPriceTest() {
        SuperCar superCar = superCarRepository.findById(4L).get();
        superCarRepository.deleteBySuperCarPrice(4000000L);
        log.info("isPresent: " + superCarRepository.findById(4L).isPresent());
    }

    @Test
    public void findBySuperCarIdTest(){
        superCarRepository.findBySuperCarId(5L).stream().map(SuperCar::toString).forEach(log::info);;
    }

    @Test
    public void findAllTest(){
        superCarRepository.findAll().stream().map(SuperCar::toString).forEach(log::info);
    }

    @Test
    public void countAll(){
        log.info(superCarRepository.countAll()+"");
    }
}
package com.example.intermediate.repository;

import com.example.intermediate.entity.Desktop;
import com.example.intermediate.entity.Developer;
import com.example.intermediate.entity.Phone;
import com.example.intermediate.entity.Planner;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(false)
public class ComputerRepositoryTest {
    @Autowired
    private DesktopRepository desktopRepository;
    @Autowired
    private PhoneRepository phoneRepository;

    @Test
    public void saveTest() {
        Desktop desktop = new Desktop();
        Phone phone = new Phone();

        desktop.create("UHD", "자작", "카리나", 5000000L, LocalDateTime.now(), "32GB", "1TB", "GeForce RTX 4090 24GB", "i9-13900K", LocalDateTime.now(), LocalDateTime.now(), "한글");
        phone.create("FHD", "SAMSUNG", "오연서", 1500000L, LocalDateTime.now(), "8GB", "512GB", "퀄컴 Adreno 730 900MHz", "Qualcomm Kryo Prime MP1 3.18GHz + Qualcomm Kryo Gold MP3 2.7GHz + Qualcomm Kryo Silver MP4 2GHz", LocalDateTime.now(), LocalDateTime.now(), "3,700mAh");

        desktopRepository.save(desktop);
        phoneRepository.save(phone);

    }

}






















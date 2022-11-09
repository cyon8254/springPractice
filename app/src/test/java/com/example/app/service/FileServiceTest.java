/*
* 게시판 서비스에 속해있기 때문에 별도의 서비스를 제작하지 않아도 된다.
* */


package com.example.app.service;

import com.example.app.domain.vo.FileVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class FileServiceTest {
    @Autowired
    private FileService fileService;

    @Test
    public void saveTest(){
        FileVO fileVO = new FileVO();
        fileVO.setFileName("day01.txt");
        fileVO.setFileSize(30L);
        fileVO.setFileUploadPath("test");
        fileVO.setFileUuid("abc111");
        fileVO.setBoardNumber(41L);

        fileService.register(fileVO);
    }

    @Test
    public void findByBoardNumberTest(){
        fileService.showAll(41L).stream().map(FileVO::toString).forEach(log::info);
    }

    @Test
    public void deleteByBoardNumberTest(){
        fileService.remove(41L);
    }
}

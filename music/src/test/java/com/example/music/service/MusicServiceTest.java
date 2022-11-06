package com.example.music.service;

import com.example.music.domain.dao.MusicDAO;
import com.example.music.domain.vo.MusicVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
public class MusicServiceTest {
    @Autowired
    private MusicService musicService;

    @Test
    public void showTest(){
        musicService.show().stream().map(MusicVO::toString).forEach(log::info);
    }

    @Test
    public void addTest(){
        MusicVO musicVO=new MusicVO();
        musicVO.setMusicTitle("ABC");
        musicVO.setMusicSinger("The Jackson 5");
        musicVO.setMusicLyrics("A B C, It's easy as 1 2 3, as simple as Do re mi, A B C, 1 2 3 Baby you and me girl");
        musicService.add(musicVO);
    }

    @Test
    public void updateTest(){
        Long musicNumber = 12L;
        MusicVO musicVO = musicService.find(musicNumber);
        musicVO.setMusicTitle("Black Or White");
        musicVO.setMusicSinger("Michael Jackson");
        musicVO.setMusicLyrics("It's black, it's white It's tough for you to get by (yeah, yeah, yeah) It's black, it's white");
        musicService.update(musicVO);
    }

    @Test
    public void deleteTest(){
        Long musicNumber=10L;
        MusicVO musicVO =musicService.find(musicNumber);
        Assertions.assertNotNull(musicVO);
        musicService.delete(musicNumber);
    }
}

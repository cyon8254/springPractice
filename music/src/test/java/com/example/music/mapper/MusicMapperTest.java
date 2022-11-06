package com.example.music.mapper;

import com.example.music.domain.vo.MusicVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MusicMapperTest {
    @Autowired
    private MusicMapper musicMapper;

    @Test
    public void getListTest(){
        musicMapper.getList().stream().map(MusicVO::toString).forEach(log::info);
    }

    @Test
    public void insertTest(){
        MusicVO musicVO = new MusicVO();
        musicVO.setMusicTitle("Knockin' On Heaven's Door");
        musicVO.setMusicSinger("Guns N' Roses");
        musicVO.setMusicLyrics("Knock, knock, knockin' on heaven's door");
        musicMapper.insert(musicVO);
    }

    @Test
    public void updateTest(){
        MusicVO musicVO = musicMapper.select(1L);
        Assertions.assertNotNull(musicVO);
        musicVO.setMusicLyrics("Sing us a song, you're the piano man Sing us a song tonight Well, we're all in the mood for a melody And you've got us feelin' alright");
        musicMapper.update(musicVO);
    }

    @Test
    public void deleteTest(){
        Long musicNumber = 3L;
        MusicVO musicVO = musicMapper.select(musicNumber);
        Assertions.assertNotNull(musicVO);
        musicMapper.delete(musicNumber);
    }

}

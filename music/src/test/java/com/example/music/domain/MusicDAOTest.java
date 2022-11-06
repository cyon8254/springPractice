package com.example.music.domain;

import com.example.music.domain.dao.MusicDAO;
import com.example.music.domain.vo.MusicVO;
import com.example.music.mapper.MusicMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MusicDAOTest {
    @Autowired
    private MusicDAO musicDAO;

    @Test
    public void findAllTest(){
        musicDAO.findAll().stream().map(MusicVO::toString).forEach(log::info);
    }

    @Test
    public void saveTest(){
        MusicVO musicVO=new MusicVO();
        musicVO.setMusicTitle("Take My Hand");
        musicVO.setMusicSinger("Simple Plan");
        musicVO.setMusicLyrics("Take my hand tonight Let's not think about tomorrow Take my hand tonight We can find some place to go");
        musicDAO.save(musicVO);
    }

    @Test
    public void setMusicTest(){
        Long musicNumber = 9L;
        MusicVO musicVO = musicDAO.findByNumber(musicNumber);
        musicVO.setMusicLyrics("Overseas, from coast to coast To find a place I love the most Where the fields are green To see you once again My love");
        musicDAO.setMusic(musicVO);
    }

    @Test
    public void deleteByNumberTest(){
        Long musicNumber=9L;
        MusicVO musicVO =musicDAO.findByNumber(musicNumber);
        Assertions.assertNotNull(musicVO);
        musicDAO.deleteByNumber(musicNumber);
    }
}

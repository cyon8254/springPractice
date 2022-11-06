package com.example.music.domain.dao;

import com.example.music.domain.vo.MusicVO;
import com.example.music.mapper.MusicMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MusicDAO {
    private final MusicMapper musicMapper;

    public List<MusicVO> findAll(){
        return musicMapper.getList();
    }

    public MusicVO findByNumber(Long musicNumber){
        return musicMapper.select(musicNumber);
    }

    public int save(MusicVO musicVO){
        return musicMapper.insert(musicVO);
    }

    public int setMusic(MusicVO musicVO){
        return musicMapper.update(musicVO);
    }

    public int deleteByNumber(Long musicNumber){
        return musicMapper.delete(musicNumber);
    }
}

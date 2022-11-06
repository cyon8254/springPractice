package com.example.music.service;

import com.example.music.domain.dao.MusicDAO;
import com.example.music.domain.vo.MusicVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("MusicList")
@Primary
@RequiredArgsConstructor
public class MusicListService implements MusicService {
    private final MusicDAO musicDAO;

    @Override
    public List<MusicVO> show() {
        return musicDAO.findAll();
    }

    @Override
    public MusicVO find(Long musicNumber) {
        return musicDAO.findByNumber(musicNumber);
    }

    @Override
    public boolean add(MusicVO musicVO) {
        return musicDAO.save(musicVO) == 1;
    }

    @Override
    public boolean update(MusicVO musicVO) {
        return musicDAO.setMusic(musicVO) == 1;
    }

    @Override
    public boolean delete(Long musicNumber) {
        return musicDAO.deleteByNumber(musicNumber) == 1;
    }
}

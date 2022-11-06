package com.example.music.service;

import com.example.music.domain.vo.MusicVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MusicService {
    public List<MusicVO> show();

    public MusicVO find(Long musicNumber);

    public boolean add(MusicVO musicVO);

    public boolean update(MusicVO musicVO);

    public boolean delete(Long musicNumber);
}

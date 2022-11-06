package com.example.music.mapper;

import com.example.music.domain.vo.MusicVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MusicMapper {
    public List<MusicVO> getList();

    public MusicVO select(Long musicNumber);

    public int insert(MusicVO musicVO);

    public int update(MusicVO musicVO);

    public int delete(Long musicNumber);
}

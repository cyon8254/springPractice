package com.example.app.service;

import com.example.app.domain.vo.BoardVO;
import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.FileVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
public class BoardServiceTest {
    @Autowired
    private BoardService boardService;

    @Test
    public void showTest(){
        Criteria criteria = new Criteria();
        criteria.createCriteria();
        boardService.show(criteria).stream().map(BoardVO::toString).forEach(log::info);
    }

    @Test
    public void addTest(){
//        BoardVO boardVO = new BoardVO();
//        boardVO.setBoardTitle("첨부파일이 없는 게시글 제목");
//        boardVO.setBoardWriter("testB");
//        boardVO.setBoardContent("첨부파일이 없는 게시글 내용");
//        boardService.add(boardVO);
//        log.info("추가된 게시글 번호: " + boardVO.getBoardNumber());

        List<FileVO> files = new ArrayList<>();
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardTitle("첨부파일이 있 게시글 제목");
        boardVO.setBoardWriter("testB");
        boardVO.setBoardContent("첨부파일이 있는 게시글 내용");
        boardService.add(boardVO);
        log.info("추가된 게시글 번호: " + boardVO.getBoardNumber());
    }

    @Test
    public void updateTest(){
        BoardVO boardVO  = boardService.find(1L);
        Assertions.assertNotNull(boardVO);
        boardVO.setBoardTitle("수정된 게시글 제목");
//        log.info("UPDATE: " + boardService.update(boardVO));
    }

    @Test
    public void deleteTest(){
        Long boardNumber = 5L;
        BoardVO boardVO = boardService.find(boardNumber);
        Assertions.assertNotNull(boardVO);
        boardService.delete(boardNumber);
    }

    @Test
    public void selectCountOfBoard(){
        log.info("board count: " + boardService.getTotal());
    }
}

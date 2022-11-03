package com.example.app_shop.mapper;

import com.example.app_shop.domain.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    //    상품 목록
    public List<ProductVO> getList();

    //    상품 조회
    public ProductVO select(Long productNumber);

    //    상품 추가
    public int insert(ProductVO productVO);

    //    상품 수정
    public int update(ProductVO productVO);

//    상품 삭제


}

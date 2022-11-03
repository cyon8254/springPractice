package com.example.app_shop.mapper;

import com.example.app_shop.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProductMapperTest {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void getListTest(){
        productMapper.getList().stream().map(ProductVO::toString).forEach(log::info);
    }
//    추가
    @Test
    public void insertTest(){
        ProductVO productVO = new ProductVO();
        productVO.setProductName("탑블레이드 팽이");
        productVO.setProductCompany("(주)손오공");
        productVO.setProductPrice(18000L);
        productMapper.insert(productVO);
        log.info("추가된 상품 번호: " + productVO.getProductNumber());
    }
//    수정
    @Test
    public void updateTest(){
        ProductVO productVO = productMapper.select(2L);
        Assertions.assertNotNull(productVO);
        productVO.setProductName("호그와트 레고");
        productVO.setProductPrice(600000L);
        log.info("UPDATE COUNT: " + productMapper.update(productVO));
    }
//    삭제
}

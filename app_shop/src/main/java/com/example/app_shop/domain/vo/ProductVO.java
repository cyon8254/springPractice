package com.example.app_shop.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductVO {
    private Long productNumber;
    private String productName;
    private String productCompany;
    private Long productPrice;
    private String productRegisterDate;
    private String productUpdateDate;
}

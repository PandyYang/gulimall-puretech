package com.pandy.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 会员价格
 */
@Data
public class MemberPrice {

    private Long id;

    private String name;

    private BigDecimal price;
}

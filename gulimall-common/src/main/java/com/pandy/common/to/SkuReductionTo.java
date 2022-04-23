package com.pandy.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author Pandy
 * @Date 2021/8/28 8:37
 */
@Data
public class SkuReductionTo {

    private Long skuId;

    private int fullCount;

    private BigDecimal discount;

    private int countStatus;

    /**
     * 满减价格
     */
    private BigDecimal fullPrice;

    private BigDecimal reducePrice;

    private int priceStatus;

    private List<MemberPrice> memberPrice;
}

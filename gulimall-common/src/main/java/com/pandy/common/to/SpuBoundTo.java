package com.pandy.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author Pandy
 * @Date 2021/8/28 8:24
 */
@Data
public class SpuBoundTo {

    private Long spuId;

    private BigDecimal buyBounds;

    private BigDecimal growBounds;
}

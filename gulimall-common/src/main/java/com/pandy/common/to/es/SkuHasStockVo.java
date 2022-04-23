package com.pandy.common.to.es;

import lombok.Data;

/**
 存储这个sku是否有库存
 */
@Data
public class SkuHasStockVo {

	private Long skuId;

	private Boolean hasStock;
}

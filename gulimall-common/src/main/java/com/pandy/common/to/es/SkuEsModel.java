package com.pandy.common.to.es;

/**
 * @Author Pandy
 * @Date 2021/8/28 23:53
 */

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * {
 *   "mappings": {
 *     "properties": {
 *       "skuId": {
 *         "type": "long"
 *       },
 *       "spuId": {
 *         "type": "keyword"
 *       },
 *       "skuTitle": {
 *         "type": "text",
 *         "analyzer": "ik_smart"
 *       },
 *       "skuPrice": {
 *         "type": "keyword"
 *       },
 *       "skuImg": {
 *         "type": "keyword",
 *         "/static/index": false,
 *         "doc_values": false
 *       },
 *       "saleCount": {
 *         "type": "long"
 *       },
 *       "hasStock": {
 *         "type": "boolean"
 *       },
 *       "hotScore": {
 *         "type": "long"
 *       },
 *       "brandId": {
 *         "type": "long"
 *       },
 *       "catalogId": {
 *         "type": "long"
 *       },
 *       "brandName": {
 *         "type": "keyword",
 *         "/static/index": false,
 *         "doc_values": false
 *       },
 *       "brandImg": {
 *         "type": "keyword",
 *         "/static/index": false,
 *         "doc_values": false
 *       },
 *       "catalogName": {
 *         "type": "keyword",
 *         "/static/index": false,
 *         "doc_values": false
 *       },
 *       "attrs": {
 *         "type": "nested",
 *         "properties": {
 *           "attrId": {
 *             "type": "long"
 *           },
 *           "attrName": {
 *             "type": "keyword",
 *             "/static/index": false,
 *             "doc_values": false
 *           },
 *           "attrValue": {
 *             "type": "keyword"
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 */

@Data
public class SkuEsModel {

    private Long skuId;

    private Long spuId;

    private String skuTitle;

    private BigDecimal skuPrice;

    private String skuImg;

    // 销售数量
    private Long saleCount;

    // 是否存在库存
    private Boolean hasStock;

    // 商品热度评分
    private Long hotScore;

    // 品牌id
    private Long brandId;

    // 分类id
    private Long catalogId;

    // 品牌名称
    private String brandName;

    // 品牌图片
    private String brandImg;

    // 分类名称
    private String catalogName;

    // 属性合集
    private List<Attrs> attrs;

    @Data
    public static class Attrs {
        private Long attrId;

        private String attrName;

        private String attrValue;
    }

}

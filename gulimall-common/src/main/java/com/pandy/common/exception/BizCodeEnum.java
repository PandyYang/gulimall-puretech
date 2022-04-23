package com.pandy.common.exception;

import lombok.Data;

/**
 * @Author Pandy
 * @Date 2021/8/22 12:58
 */
public enum BizCodeEnum {

    UNKNOW_EXCEPTION(10000, "系统未知异常"),
    VALID_EXCEPTION(10001, "参数校验失败"),
    SMS_CODE_EXCEPTION(10002, "验证码获取频率太高,稍后再试"),
    TO_MANY_REQUEST(10003, "请求流量过大"),
    SMS_SEND_CODE_EXCEPTION(10403, "短信发送失败"),
    USER_EXIST_EXCEPTION(15001, "用户已经存在"),
    PHONE_EXIST_EXCEPTION(15002, "手机号已经存在"),
    LOGINACTT_PASSWORD_ERROR(15003, "账号或密码错误"),
    SOCIALUSER_LOGIN_ERROR(15004, "社交账号登录失败"),
    NOT_STOCK_EXCEPTION(21000, "商品库存不足"),
    SECKILL_EXCEPTION(10005,"秒杀请求过多，请重新再试"),
    PRODUCT_UP_EXCEPTION(11000, "商品上架异常");

    private int code;
    private String msg;

    BizCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

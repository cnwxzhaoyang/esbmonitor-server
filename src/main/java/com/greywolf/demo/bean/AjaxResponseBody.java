package com.greywolf.demo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author GreyWolf
 * @Date 2020/5/28 13:14
 * @Version 1.0
 */
@ApiModel(value = "通用的ajax响应实体")
public class AjaxResponseBody<T> {

    @ApiModelProperty(value = "消息，请求成功时为空，请求发生异常时，显示异常的提示")
    private String message;

    @ApiModelProperty(value = "时间戳")
    private long timestamp;

    @ApiModelProperty(value = "结果，泛型")
    private T result;

    @ApiModelProperty(value = "状态码，默认200")
    private int code = 200;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

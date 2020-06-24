package com.greywolf.demo.esbmonitor.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author GreyWolf
 * @Date 2020/6/16 9:57
 * @Version 1.0
 */
@ApiModel(value = "服务调用成功率统计")
public class SuccessRatioStats {

    @ApiModelProperty(value = "成功数量")
    private int successNum;

    @ApiModelProperty(value = "失败数量")
    private int failNum;

    public int getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(int successNum) {
        this.successNum = successNum;
    }

    public int getFailNum() {
        return failNum;
    }

    public void setFailNum(int failNum) {
        this.failNum = failNum;
    }
}

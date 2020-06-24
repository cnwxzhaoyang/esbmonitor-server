package com.greywolf.demo.esbmonitor.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 告警率统计
 * @Author GreyWolf
 * @Date 2020/6/16 9:59
 * @Version 1.0
 */
@ApiModel(value = "服务调用告警率统计")
public class WarningRationStats {

    @ApiModelProperty(value = "跨密级访问数量")
    private int acrossSecurityNum;//跨密级访问数量

    @ApiModelProperty(value = "频繁调用次数")
    private int frequentCallNum;//频繁调用次数

    @ApiModelProperty(value = "请求参数过大")
    private int heavyParamsNum;//请求参数过大

    @ApiModelProperty(value = "其他原因")
    private int othersNum;

    public int getAcrossSecurityNum() {
        return acrossSecurityNum;
    }

    public void setAcrossSecurityNum(int acrossSecurityNum) {
        this.acrossSecurityNum = acrossSecurityNum;
    }

    public int getFrequentCallNum() {
        return frequentCallNum;
    }

    public void setFrequentCallNum(int frequentCallNum) {
        this.frequentCallNum = frequentCallNum;
    }

    public int getHeavyParamsNum() {
        return heavyParamsNum;
    }

    public void setHeavyParamsNum(int heavyParamsNum) {
        this.heavyParamsNum = heavyParamsNum;
    }

    public int getOthersNum() {
        return othersNum;
    }

    public void setOthersNum(int othersNum) {
        this.othersNum = othersNum;
    }
}

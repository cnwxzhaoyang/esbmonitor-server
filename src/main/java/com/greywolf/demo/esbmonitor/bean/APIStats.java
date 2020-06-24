package com.greywolf.demo.esbmonitor.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 接口统计
 * @Author GreyWolf
 * @Date 2020/6/16 9:14
 * @Version 1.0
 */
@ApiModel(value = "接口统计实体")
public class APIStats {

    @ApiModelProperty(value = "接入本平台的接口总数")
    private int totalCount;

    @ApiModelProperty(value = "月均接入量，平均每个月的接入数量")
    private int monthlyNum;

    @ApiModelProperty(value = "调用总次数")
    private int calledCount;

    @ApiModelProperty(value = "日均调用数量")
    private int calledDailyCount;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getMonthlyNum() {
        return monthlyNum;
    }

    public void setMonthlyNum(int monthlyNum) {
        this.monthlyNum = monthlyNum;
    }

    public int getCalledCount() {
        return calledCount;
    }

    public void setCalledCount(int calledCount) {
        this.calledCount = calledCount;
    }

    public int getCalledDailyCount() {
        return calledDailyCount;
    }

    public void setCalledDailyCount(int calledDailyCount) {
        this.calledDailyCount = calledDailyCount;
    }
}

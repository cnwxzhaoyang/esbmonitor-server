package com.greywolf.demo.esbmonitor.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 接入平台的系统（生产者统计）
 * @Author GreyWolf
 * @Date 2020/6/16 9:00
 * @Version 1.0
 */
@ApiModel(value = "生产者的统计数据")
public class ProducerStats implements Serializable {

    @ApiModelProperty(value = "接入本平台的系统总数（生产者数量）")
    private int totalCount;

    @ApiModelProperty(value = "月同比（增加为+,减少为-，本月接入的数量与上月接入的数量之差除以上月的接入数量，乘以100，保留整数）")
    private int monthRatio;

    @ApiModelProperty(value = "周同比（增加为+,减少为-，本周接入的数量与上周接入的数量之差除以上周的接入数量，乘以100，保留整数）")
    private int weekRatio;

    @ApiModelProperty(value = "月均接入量，平均每个月的接入数量")
    private int monthlyNum;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getMonthRatio() {
        return monthRatio;
    }

    public void setMonthRatio(int monthRatio) {
        this.monthRatio = monthRatio;
    }

    public int getWeekRatio() {
        return weekRatio;
    }

    public void setWeekRatio(int weekRatio) {
        this.weekRatio = weekRatio;
    }

    public int getMonthlyNum() {
        return monthlyNum;
    }

    public void setMonthlyNum(int monthlyNum) {
        this.monthlyNum = monthlyNum;
    }
}


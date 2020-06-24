package com.greywolf.demo.esbmonitor.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author GreyWolf
 * @Date 2020/6/17 9:28
 * @Version 1.0
 */
@ApiModel(value = "耗时接口")
public class TimeConsumingAPI implements Serializable {


    @ApiModelProperty(value = "排名，按照调用时长排名")
    private int rankIndex;

    @ApiModelProperty(value = "接口名称")
    private String name;

    @ApiModelProperty(value = "接口所属系统")
    private String belongSystem;

    @ApiModelProperty(value = "耗时，单位：毫秒")
    private long consumingTime;

    public int getRankIndex() {
        return rankIndex;
    }

    public void setRankIndex(int rankIndex) {
        this.rankIndex = rankIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBelongSystem() {
        return belongSystem;
    }

    public void setBelongSystem(String belongSystem) {
        this.belongSystem = belongSystem;
    }

    public long getConsumingTime() {
        return consumingTime;
    }

    public void setConsumingTime(long consumingTime) {
        this.consumingTime = consumingTime;
    }
}

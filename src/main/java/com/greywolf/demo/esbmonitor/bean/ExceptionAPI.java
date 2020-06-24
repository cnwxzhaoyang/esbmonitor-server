package com.greywolf.demo.esbmonitor.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author GreyWolf
 * @Date 2020/6/17 9:23
 * @Version 1.0
 */
@ApiModel(value = "出错接口实体")
public class ExceptionAPI {

    @ApiModelProperty(value = "排名，按照调用出错次数排名")
    private int rankIndex;

    @ApiModelProperty(value = "接口名称")
    private String name;

    @ApiModelProperty(value = "所属系统")
    private String belongSystem;

    @ApiModelProperty(value = "出错原因")
    private String cause;

    @ApiModelProperty(value = "出错次数")
    private int exceptionNum;

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

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public int getExceptionNum() {
        return exceptionNum;
    }

    public void setExceptionNum(int exceptionNum) {
        this.exceptionNum = exceptionNum;
    }
}

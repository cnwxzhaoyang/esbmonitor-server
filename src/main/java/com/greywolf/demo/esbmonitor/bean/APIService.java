package com.greywolf.demo.esbmonitor.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author GreyWolf
 * @Date 2020/6/16 9:44
 * @Version 1.0
 */
@ApiModel(value = "接口")
public class APIService {

    @ApiModelProperty(value = "接口名称")
    private String name;

    @ApiModelProperty(value = "消费数量(被调用的次数)")
    private int calledNo;

    public APIService(){}

    public APIService(String name, int calledNo) {
        this.name = name;
        this.calledNo = calledNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalledNo() {
        return calledNo;
    }

    public void setCalledNo(int calledNo) {
        this.calledNo = calledNo;
    }
}

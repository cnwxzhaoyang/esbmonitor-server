package com.greywolf.demo.esbmonitor.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 服务列表对应的实体
 * @Author GreyWolf
 * @Date 2020/6/15 17:48
 * @Version 1.0
 */
@ApiModel(value = "服务实体",description = "参考示例代码即可")
public class ServiceEntity implements Serializable {

    @ApiModelProperty(value = "主键，全局唯一")
    private String id;

    @ApiModelProperty(value = "服务名称")
    private String name;

    @ApiModelProperty(value = "服务供方")
    private String supplier;

    @ApiModelProperty(value = "服务描述")
    private String description;

    @ApiModelProperty(value = "调用次数")
    private int callNo;

    @ApiModelProperty(value = "密级,枚举类型,0:非秘,10:内密,15:商密,20:机密,30:绝密")
    private int grade;

    @ApiModelProperty(value = "状态,枚举类型,0:关闭,1:运行中,2:异常")
    private int status;

    @ApiModelProperty(value = "更新时间，格式:'YYYY-MM-DD hh:mm:ss'")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCallNo() {
        return callNo;
    }

    public void setCallNo(int callNo) {
        this.callNo = callNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}

package com.greywolf.demo.esbmonitor.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author GreyWolf
 * @Date 2020/6/15 15:22
 * @Version 1.0
 */
@ApiModel(value = "日志实体")
public class LogEntity implements Serializable {

    @ApiModelProperty(value = "主键，全局唯一")
    private String id;

    @ApiModelProperty(value = "客户端ip地址")
    private String clientIP;

    @ApiModelProperty(value = "接口名称")
    private String apiName;

    @ApiModelProperty(value = "系统名称")
    private String systemName;

    @ApiModelProperty(value = "操作类型(枚举，0:新增;1:修改,2:删除,3:查询,4:其它)",allowableValues = "0,1,2,3,4")
    private int operationType;

    @ApiModelProperty(value = "访问时间,格式:'YYYY-MM-DD hh:mm:ss'")
    private String visitTime;

    @ApiModelProperty(value = "传入参数")
    private String paramsStr;

    @ApiModelProperty(value = "响应完成时间，格式:'YYYY-MM-DD hh:mm:ss'")
    private String respTime;

    @ApiModelProperty(value = "响应内容")
    private String respStr;

    @ApiModelProperty(value = "如果调用失败，则失败的原因")
    private String errMsg;

    @ApiModelProperty(value = "是否调用成功,枚举，0：失败,1:成功")
    private int success;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getParamsStr() {
        return paramsStr;
    }

    public void setParamsStr(String paramsStr) {
        this.paramsStr = paramsStr;
    }

    public String getRespTime() {
        return respTime;
    }

    public void setRespTime(String respTime) {
        this.respTime = respTime;
    }

    public String getRespStr() {
        return respStr;
    }

    public void setRespStr(String respStr) {
        this.respStr = respStr;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }
}

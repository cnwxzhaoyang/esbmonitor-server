package com.greywolf.demo.esbmonitor.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author GreyWolf
 * @Date 2020/5/28 18:23
 * @Version 1.0
 */
public class ActionEntity {

    private String action;

    private boolean defaultCheck;

    private String describe;

    public ActionEntity(){}

    public ActionEntity(String action, boolean defaultCheck, String describe) {
        this.action = action;
        this.defaultCheck = defaultCheck;
        this.describe = describe;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean isDefaultCheck() {
        return defaultCheck;
    }

    public void setDefaultCheck(boolean defaultCheck) {
        this.defaultCheck = defaultCheck;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}

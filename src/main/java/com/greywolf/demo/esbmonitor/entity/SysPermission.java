package com.greywolf.demo.esbmonitor.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Author GreyWolf
 * @Date 2020/5/28 18:20
 * @Version 1.0
 */
public class SysPermission {

    private String roleId;

    private String permissionName;

    private String permissionId;

    private String dataAccess;

    private String actions;

    private List<String> actionList;

    private List<ActionEntity> actionEntityList;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(String dataAccess) {
        this.dataAccess = dataAccess;
    }

    public List<String> getActionList() {
        return actionList;
    }

    public void setActionList(List<String> actionList) {
        this.actionList = actionList;
    }

    public List<ActionEntity> getActionEntityList() {
        return actionEntityList;
    }

    public void setActionEntityList(List<ActionEntity> actionEntityList) {
        this.actionEntityList = actionEntityList;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }
}

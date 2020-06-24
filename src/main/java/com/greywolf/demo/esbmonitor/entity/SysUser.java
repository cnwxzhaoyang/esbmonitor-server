package com.greywolf.demo.esbmonitor.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author GreyWolf
 * @Date 2020/5/28 14:09
 * @Version 1.0
 */
@ApiModel(value="用户实体",description = "参考示例代码组织数据即可")
public class SysUser implements Serializable {

    @ApiModelProperty(value="用户唯一标识,通常对应数据库表中的主键",name="id")
    private String id;

    @ApiModelProperty(value="用户真实姓名",name="name",example = "张三")
    private String name;

    @ApiModelProperty(value="用户名",name="username",example="xingguo")
    private String username;

    @ApiModelProperty(value="密码",name="password")
    private String password;

    @ApiModelProperty(value="头像",name="avatar")
    private String avatar;

    private String status;

    private String telephone;

    private String lastLoginIp;

    private String lastLoginTime;

    private String creatorId;

    private String createTime;

    private String merchantCode;

    private String deleted;

    private String roleId;

//    private SysRole role;

    private String token;

    public SysUser(){}

    public SysUser(String id, String name ,String username, String password, String avatar, String status, String telephone, String lastLoginIp, String lastLoginTime, String creatorId, String createTime, String merchantCode, String deleted, String roleId) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.status = status;
        this.telephone = telephone;
        this.lastLoginIp = lastLoginIp;
        this.lastLoginTime = lastLoginTime;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.merchantCode = merchantCode;
        this.deleted = deleted;
        this.roleId = roleId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

//    public SysRole getRole() {
//        return role;
//    }
//
//    public void setRole(SysRole role) {
//        this.role = role;
//    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

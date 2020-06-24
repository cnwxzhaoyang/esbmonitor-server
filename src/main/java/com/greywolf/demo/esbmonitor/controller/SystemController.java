package com.greywolf.demo.esbmonitor.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greywolf.demo.bean.AjaxResponseBody;
import com.greywolf.demo.esbmonitor.entity.ActionEntity;
import com.greywolf.demo.esbmonitor.entity.SysPermission;
import com.greywolf.demo.esbmonitor.entity.SysRole;
import com.greywolf.demo.esbmonitor.entity.SysUser;
import com.greywolf.demo.util.BeanUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Author GreyWolf
 * @Date 2020/6/21 11:07
 * @Version 1.0
 */
@SuppressWarnings("deprecation")
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags={"用户-角色接口"},description = "登录验证,用户权限查询,角色权限查询,注销，由于本系统只提供可视化功能，该部分的数据固化即可，建议直接参考示例代码组织数据",produces = MediaType.APPLICATION_JSON_VALUE )
public class SystemController {


    @PostMapping(value = "/auth/login")
    @ApiOperation(value = "用户登录认证",httpMethod = "POST",notes = "用户名/密码固化为：admin/admin.123")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user",value = "用户名和密码，建议定义实体SystemUser,通过@RequestBody SysUser user接收",required = true,paramType = "body",dataType = "SysUser")
    })
    public AjaxResponseBody<Map<String,Object>> login(@RequestBody SysUser user){
        AjaxResponseBody<Map<String,Object>> resp = new AjaxResponseBody<>();
        if (user.getUsername().equalsIgnoreCase("admin")|| user.getUsername().equalsIgnoreCase("super")){
            if (user.getPassword().equalsIgnoreCase("4b78e581bdaffa037a6b11d58bdc934a")){
                user.setId("1");
                user.setName("管理员");
                user.setRoleId("admin");
                user.setStatus("1");
                user.setTelephone("");
                user.setLastLoginIp("27.154.74.117");
                user.setLastLoginTime("1534837621348");
                user.setCreatorId("admin");
                user.setCreateTime("1497160610259");
                user.setDeleted("0");
                user.setRoleId("admin");
                user.setToken("4291d7da9005377ec9aec4a71ea837f");
                resp.setResult(BeanUtil.beanToMap(user));
                resp.setTimestamp(new Date().getTime());
                resp.setCode(200);
                return resp;
            }
        }
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("isLogin",true);
        resp.setResult(resultMap);
        resp.setMessage("账户或者密码错误");
        resp.setTimestamp(new Date().getTime());
        resp.setCode(401);
        return resp;
    }

//    @PostMapping(value = "/auth/2step-code")
//    @ApiOperation(value = "认证方式选择",httpMethod = "POST")
//    public AjaxResponseBody<Map<String,Object>> getStepCode(){
//        AjaxResponseBody<Map<String,Object>> resp = new AjaxResponseBody<>();
//        Map<String,Object> resultMap = new HashMap<>();
//        resultMap.put("stepCode",1);
//        resp.setResult(resultMap);
//        return resp;
//    }

    @PostMapping(value = "/auth/logout")
    @ApiOperation(value = "注销",httpMethod = "POST")
    public AjaxResponseBody doLogout(){
        AjaxResponseBody resp = new AjaxResponseBody<>();
        resp.setMessage("注销成功");
        return resp;
    }


    @GetMapping(value = "/system/user")
    @ApiOperation(value = "查询用户",httpMethod = "GET")
    public AjaxResponseBody<SysUser> getUserInfo(@RequestHeader(value = "access-token")String token) throws JsonProcessingException {
        AjaxResponseBody<SysUser> resp = new AjaxResponseBody<>();
        ObjectMapper objectMapper = new ObjectMapper();
        SysUser sysUser = new SysUser("01","管理员","admin","","/avatar2.jpg","1","123","27.154.74.117","1534837621348",
                "admin","1497160610259","TLif2btpzg079h15bk","0","admin");
//        SysRole role = new SysRole();
//        role.setCreateTime("1497160610259");
//        role.setCreatorId("system");
//        role.setDeleted(0);
//        role.setDescribe("拥有所有权限");
//        role.setId("admin");
//        role.setName("管理员");
//        Map<String,String> permissionMap = new HashMap<String,String>(){{
//            put("dashboard","仪表盘");
//        }};
//
//        List<String> permissionList = new ArrayList<String>(){{
//            addAll(permissionMap.keySet());
//            add("table");
//        }};
//
//        role.setPermissionList(permissionList);
//
//        List<SysPermission> permissions = new ArrayList<>();
//        for (String permissionName:permissionList) {
//            SysPermission permission = new SysPermission();
//            ArrayList<ActionEntity> actionEntities = new ArrayList<ActionEntity>(){{
//                add(new ActionEntity("add",false,"新增"));
//                add(new ActionEntity("query",false,"查询"));
//                add(new ActionEntity("get",false,"详情"));
//                add(new ActionEntity("update",false,"修改"));
//                add(new ActionEntity("delete",false,"删除"));
//            }};
//            permission.setActionEntityList(actionEntities);
//            permission.setActionList(new ArrayList<String>(){{
//                add("add");
//                add("query");
//                add("get");
//                add("update");
//                add("delete");
//            }});
//            permission.setActions(objectMapper.writeValueAsString(actionEntities));
//            permission.setPermissionId(permissionName);
//            permission.setPermissionName(permissionMap.get(permissionName));
//            permission.setRoleId("admin");
//            permissions.add(permission);
//        }
//        role.setPermissions(permissions);
//        sysUser.setRole(role);
        resp.setResult(sysUser);
        return resp;
    }


//    @GetMapping(value = "/system/role")
//    @ApiOperation(value = "查询角色",httpMethod = "GET")
//    public AjaxResponseBody<Map<String, SysRole>> getRoleInfo(){
//
//        AjaxResponseBody<Map<String, SysRole>> resp = new AjaxResponseBody<>();
//        Map<String,SysRole> data = new HashMap<String,SysRole>(){{
//            SysRole role = new SysRole();
//            role.setCreateTime("1497160610259");
//            role.setCreatorId("system");
//            role.setDeleted(0);
//            role.setDescribe("拥有所有权限");
//            role.setId("admin");
//            role.setName("管理员");
//            Map<String,String>  permissionMap = new HashMap<String,String>(){{
//                put("dashboard","仪表盘");
//            }};
//
//            List<String> permissionList = new ArrayList<String>(){{
//                addAll(permissionMap.keySet());
//                add("table");
//            }};
//
//            role.setPermissionList(permissionList);
//
//            List<SysPermission> permissions = new ArrayList<>();
//            for (String permissionName:permissionList) {
//                SysPermission permission = new SysPermission();
//                ArrayList<ActionEntity> actionEntities = new ArrayList<ActionEntity>(){{
//                    add(new ActionEntity("add",false,"新增"));
//                    add(new ActionEntity("query",false,"查询"));
//                    add(new ActionEntity("get",false,"详情"));
//                    add(new ActionEntity("update",false,"修改"));
//                    add(new ActionEntity("delete",false,"删除"));
//                }};
//                permission.setActionEntityList(actionEntities);
//                permission.setActionList(new ArrayList<String>(){{
//                    add("add");
//                    add("query");
//                    add("get");
//                    add("update");
//                    add("delete");
//                }});
//                permission.setPermissionId(permissionName);
//                permission.setPermissionName(permissionMap.get(permissionName));
//                permission.setRoleId("admin");
//                permissions.add(permission);
//            }
//            role.setPermissions(permissions);
//            put("data",role);
//        }};
//        resp.setResult(data);
//        return resp;
//    }
}

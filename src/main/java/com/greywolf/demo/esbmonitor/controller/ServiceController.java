package com.greywolf.demo.esbmonitor.controller;

import com.greywolf.demo.bean.AjaxResponseBody;
import com.greywolf.demo.bean.VueTableData;
import com.greywolf.demo.esbmonitor.entity.ServiceEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author GreyWolf
 * @Date 2020/6/15 17:48
 * @Version 1.0
 */
@SuppressWarnings("deprecation")
@RequestMapping(value = "/service",produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@Api(value="",tags={"服务接口"},description = "用于显示服务列表，代码示例，服务校验" )
public class ServiceController {

    @PostMapping(value = "getServiceList")
    @ApiOperation(value = "查询系统上架的服务列表",httpMethod = "POST",notes = "支持多个字段的组合查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo",value = "分页查询的第{pageNo}页",required = true,paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "pageSize",value = "分页查询每页显示{pageSize}条记录",required = true,paramType = "query",dataType = "int")
    })
    public AjaxResponseBody<VueTableData<ServiceEntity>> getServiceList(long pageNo, long pageSize){
        AjaxResponseBody<VueTableData<ServiceEntity>> response = new AjaxResponseBody<>();

        List<ServiceEntity> serviceList = new ArrayList<ServiceEntity>(){{
            for (int i = 0; i < 1000; i++) {
                ServiceEntity temp = new ServiceEntity();
                temp.setId(String.valueOf(i));
                temp.setName("name-"+i);
                temp.setSupplier("supplier-"+i);
                temp.setDescription("description-"+i);
                temp.setCallNo(i);
                temp.setGrade(0);
                temp.setStatus(2);
                temp.setUpdatedAt("2020-06-18");
                add(temp);
            }
        }};
        VueTableData<ServiceEntity> tableData = new VueTableData<>();
        tableData.setData(serviceList);
        tableData.setPageNo(pageNo);
        tableData.setPageSize(pageSize);
        tableData.setTotalCount(serviceList.size());
        tableData.setTotalPage(100);
        response.setResult(tableData);
        return response;
    }


    @PostMapping(value = "getExampleCode")
    @ApiOperation(value = "查询示例代码",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type",value = "编程语言类型,枚举类型，0:java,1:Spring Boot,2:Spring cloud,3:NodeJS,4:C++,5:Python",required = true,paramType = "query",dataType = "int"),
    })
    public AjaxResponseBody<String> getExampleCode(int type){
        AjaxResponseBody<String> response = new AjaxResponseBody<>();
        String exampleCode = "          package com.alibaba.nacos.example.spring.boot.controller;\n" +
                "\n" +
                "          import com.alibaba.nacos.api.config.annotation.NacosValue;\n" +
                "          import org.springframework.stereotype.Controller;\n" +
                "          import org.springframework.web.bind.annotation.RequestMapping;\n" +
                "          import org.springframework.web.bind.annotation.ResponseBody;\n" +
                "\n" +
                "          import static org.springframework.web.bind.annotation.RequestMethod.GET;\n" +
                "\n" +
                "          @Controller\n" +
                "          @RequestMapping(\"config\")\n" +
                "          public class ConfigController {\n" +
                "\n" +
                "              private boolean useLocalCache;\n" +
                "\n" +
                "              @RequestMapping(value = \"/get\", method = GET)\n" +
                "              @ResponseBody\n" +
                "              public boolean get() {\n" +
                "                  return useLocalCache;\n" +
                "              }\n" +
                "          }";
        response.setResult(exampleCode);
        return response;
    }

    @PostMapping(value = "validate")
    @ApiOperation(value = "服务校验",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "serviceId",value = "服务的id",required = true,paramType = "query",dataType = "string"),
    })
    public AjaxResponseBody<Boolean> validate(String serviceId){
        AjaxResponseBody<Boolean> resp = new AjaxResponseBody<>();
        System.out.println("需要校验的服务的id = "+serviceId);
        resp.setResult(true);
        return resp;
    }


}

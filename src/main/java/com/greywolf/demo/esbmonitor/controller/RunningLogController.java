package com.greywolf.demo.esbmonitor.controller;

import com.greywolf.demo.bean.AjaxResponseBody;
import com.greywolf.demo.bean.VueTableData;
import com.greywolf.demo.esbmonitor.entity.LogEntity;
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
 * 运行日志控制器
 * @Author GreyWolf
 * @Date 2020/6/15 15:14
 * @Version 1.0
 */
@SuppressWarnings("yar")
@RequestMapping(value = "/log",produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@Api(tags = "运行日志接口",description = "多条件筛选 查询日志的列表")
public class RunningLogController {

    @PostMapping(value = "getLogList")
    @ApiOperation(value = "查询系统的运行日志",httpMethod = "POST",notes = "支持多个字段的组合查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNo",value = "分页查询的第{pageNo}页",required = true,paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "pageSize",value = "分页查询每页显示{pageSize}条记录",required = true,paramType = "query",dataType = "int")
    })
    public AjaxResponseBody<VueTableData<LogEntity>> getLogList(long pageNo, long pageSize){
        AjaxResponseBody<VueTableData<LogEntity>>response = new AjaxResponseBody<>();
        List<LogEntity> logList = new ArrayList<LogEntity>(){{
            for (int i = 0; i < 1000; i++) {
                LogEntity temp = new LogEntity();
                temp.setId(String.valueOf(i));
                temp.setClientIP("192.168.10.176");
                temp.setApiName("apiName-"+i);
                temp.setSystemName("system-"+i);
                temp.setOperationType(0);
                temp.setVisitTime("2020-06-18");
                temp.setParamsStr("传入参数为a=1,b=2");
                temp.setRespTime("2020-06-18");
                temp.setRespStr("respStr"+i);
                temp.setSuccess(1);
                add(temp);
            }
        }};
        VueTableData<LogEntity> tableData = new VueTableData<>();
        tableData.setData(logList);
        tableData.setPageNo(pageNo);
        tableData.setPageSize(pageSize);
        tableData.setTotalCount(logList.size());
        tableData.setTotalPage(100);
        response.setResult(tableData);

        return response;
    }
}

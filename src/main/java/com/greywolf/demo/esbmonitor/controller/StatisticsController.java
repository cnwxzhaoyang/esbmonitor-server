package com.greywolf.demo.esbmonitor.controller;

import com.greywolf.demo.bean.AjaxResponseBody;
import com.greywolf.demo.esbmonitor.bean.*;
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
import java.util.Random;

/**
 * @Author GreyWolf
 * @Date 2020/6/16 8:53
 * @Version 1.0
 */
@SuppressWarnings("deprecation")
@RequestMapping("/stats")
@RestController
@Api(tags={"统计查询接口"},description = "用于系统相关服务、接口的调用情况的查询，前台采取各种图表的形式作可视化展示",produces = MediaType.APPLICATION_JSON_VALUE)
public class StatisticsController {

    @PostMapping(value = "/getProducerStats")
    @ApiOperation(value = "统计已注册生产者的相关信息",httpMethod = "POST")
    public AjaxResponseBody<ProducerStats> getProducerInfo(){
        AjaxResponseBody<ProducerStats> resp = new AjaxResponseBody<>();
        ProducerStats stats = new ProducerStats();
        stats.setTotalCount(100);
        stats.setMonthRatio(12);
        stats.setWeekRatio(10);
        stats.setMonthlyNum(25);
        resp.setResult(stats);
        return resp;
    }

    @PostMapping(value = "/getAPIStats")
    @ApiOperation(value = "统计接口的相关信息",httpMethod = "POST")
    public AjaxResponseBody<APIStats> getAPIInfo(){
        AjaxResponseBody<APIStats> resp = new AjaxResponseBody<>();
        APIStats stats = new APIStats();
        stats.setTotalCount(100);
        stats.setMonthlyNum(12);
        stats.setCalledCount(10);
        stats.setCalledDailyCount(10);
        resp.setResult(stats);
        return resp;
    }

    @PostMapping(value = "/getCalledTop10APIs")
    @ApiOperation(value = "统计被调用次数最多的前10个接口的名称及对应的数量",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate",value = "统计的开始时间,格式：'YYYY-MM-DD hh:mm:ss'",required = true,paramType = "query",dataType = "string"),
            @ApiImplicitParam(name = "endDate",value = "统计的结束时间,格式：'YYYY-MM-DD hh:mm:ss'",required = true,paramType = "query",dataType = "string")
    })
    public AjaxResponseBody<List<APIService>> getCalledTop10APIList(String startDate,String endDate){
        AjaxResponseBody<List<APIService>> resp = new AjaxResponseBody<>();
        List<APIService> serviceList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            serviceList.add(new APIService("名称"+i,i));
        }
        resp.setResult(serviceList);
        return resp;
    }

    @PostMapping(value = "/getSuccessRatioStats")
    @ApiOperation(value = "统计接口调用成功率",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startDate",value = "统计的开始时间,格式：'YYYY-MM-DD hh:mm:ss'",required = true,paramType = "query",dataType = "string"),
            @ApiImplicitParam(name = "endDate",value = "统计的结束时间,格式：'YYYY-MM-DD hh:mm:ss'",required = true,paramType = "query",dataType = "string")
    })
    public AjaxResponseBody<SuccessRatioStats> getSuccessRatioStats(String startDate,String endDate){
        AjaxResponseBody<SuccessRatioStats> resp = new AjaxResponseBody<>();
        SuccessRatioStats successRatioStats = new SuccessRatioStats();
        Random random = new Random();
        successRatioStats.setSuccessNum(random.nextInt(100));
        successRatioStats.setFailNum(random.nextInt(15));
        resp.setResult(successRatioStats);
        return resp;
    }

    @PostMapping(value = "/getWarningRationStats")
    @ApiOperation(value = "统计接口调用告警率",httpMethod = "POST")
    public AjaxResponseBody<WarningRationStats> getWarningRationStats(String startDate,String endDate){
        AjaxResponseBody<WarningRationStats> resp = new AjaxResponseBody<>();
        WarningRationStats warningRationStats = new WarningRationStats();
        Random random = new Random();
        warningRationStats.setAcrossSecurityNum(random.nextInt(50));
        warningRationStats.setFrequentCallNum(random.nextInt(10));
        warningRationStats.setHeavyParamsNum(random.nextInt(5));
        warningRationStats.setOthersNum(random.nextInt(12));
        resp.setResult(warningRationStats);
        return resp;
    }

    @PostMapping(value = "/getTop5ExceptionAPI")
    @ApiOperation(value = "统计出错接口top5",httpMethod = "POST")
    public AjaxResponseBody<List<ExceptionAPI>> getTop5ExceptionAPI(){
        AjaxResponseBody<List<ExceptionAPI>> resp = new AjaxResponseBody<>();
        List<ExceptionAPI> exceptionAPIList = new ArrayList<ExceptionAPI>(){{
            for (int i = 0; i <5 ; i++) {
                ExceptionAPI api = new ExceptionAPI();
                api.setRankIndex(i);
                api.setName("名称"+i);
                api.setBelongSystem("所属系统"+i);
                api.setExceptionNum(i*10);
                api.setCause("出错原因"+i);
                add(api);
            }
        }};
        resp.setResult(exceptionAPIList);
        return resp;
    }

    @PostMapping(value = "/getTop5TimeConsumingAPI")
    @ApiOperation(value = "统计耗时接口top5",httpMethod = "POST")
    public AjaxResponseBody<List<TimeConsumingAPI>> getTop5TimeConsumingAPI(){
        AjaxResponseBody<List<TimeConsumingAPI>> resp = new AjaxResponseBody<>();
        List<TimeConsumingAPI> list = new ArrayList<TimeConsumingAPI>(){{
            for (int i = 0; i <5 ; i++) {
                TimeConsumingAPI api = new TimeConsumingAPI();
                api.setRankIndex(i);
                api.setName("名称"+i);
                api.setBelongSystem("所属系统"+i);
                api.setConsumingTime(i*12);
                add(api);
            }
        }};
        resp.setResult(list);
        return resp;
    }
}

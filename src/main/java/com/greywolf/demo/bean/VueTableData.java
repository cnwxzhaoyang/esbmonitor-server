package com.greywolf.demo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Author GreyWolf
 * @Date 2020/6/15 15:19
 * @Version 1.0
 */
@ApiModel(value = "列表数据实体")
public class VueTableData<T> {

    @ApiModelProperty(value = "每页的记录条数")
    private long pageSize;

    @ApiModelProperty(value = "第几页")
    private long pageNo;

    @ApiModelProperty(value = "记录总数")
    private long totalCount;

    @ApiModelProperty(value = "总页数")
    private int totalPage;

    @ApiModelProperty(value = "列表数据")
    private List<T> data;

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getPageNo() {
        return pageNo;
    }

    public void setPageNo(long pageNo) {
        this.pageNo = pageNo;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }


    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}

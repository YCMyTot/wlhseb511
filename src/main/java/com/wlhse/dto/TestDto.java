package com.wlhse.dto;

import org.springframework.stereotype.Component;

/**
 * @Author:
 * @Despriction:
 * @Data: 2018/11/14 17:12
 */
@Component
public class TestDto {
    private String problemSourceName;
    private String test1;
    private int pagenum;
    private int pagesize;

    public String getProblemSourceName() {
        return problemSourceName;
    }

    public void setProblemSourceName(String problemSourceName) {
        this.problemSourceName = problemSourceName;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }
}

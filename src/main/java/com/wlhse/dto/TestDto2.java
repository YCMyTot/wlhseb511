package com.wlhse.dto;

import org.springframework.stereotype.Component;

/**
 * @Author:
 * @Despriction:
 * @Data: 2018/11/14 17:12
 */
@Component
public class TestDto2 {
    private String problemSourceName;
    private String test1;
    private String test2;
    private String test3;
    private String problemSourceCode;

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

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }

    public String getProblemSourceCode() {
        return problemSourceCode;
    }

    public void setProblemSourceCode(String problemSourceCode) {
        this.problemSourceCode = problemSourceCode;
    }

    @Override
    public String toString() {
        return "TestDto2{" +
                "problemSourceName='" + problemSourceName + '\'' +
                ", test1='" + test1 + '\'' +
                ", test2='" + test2 + '\'' +
                ", test3='" + test3 + '\'' +
                ", problemSourceCode='" + problemSourceCode + '\'' +
                '}';
    }
}

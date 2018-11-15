package com.wlhse.entity;

import org.springframework.stereotype.Component;

/**
 * @Author:
 * @Despriction:
 * @Data: 2018/11/13 10:45
 */
@Component
public class ProblemSourcePojo {
    private Integer problemSourceID;
    private String problemSourceCode;
    private String problemSourceName;

    public Integer getProblemSourceID() {
        return problemSourceID;
    }

    public void setProblemSourceID(Integer problemSourceID) {
        this.problemSourceID = problemSourceID;
    }

    public String getProblemSourceCode() {
        return problemSourceCode;
    }

    public void setProblemSourceCode(String problemSourceCode) {
        this.problemSourceCode = problemSourceCode;
    }

    public String getProblemSourceName() {
        return problemSourceName;
    }

    public void setProblemSourceName(String problemSourceName) {
        this.problemSourceName = problemSourceName;
    }

    @Override
    public String toString() {
        return "ProblemSourcePojo{" +
                "problemSourceID=" + problemSourceID +
                ", problemSourceCode='" + problemSourceCode + '\'' +
                ", problemSourceName='" + problemSourceName + '\'' +
                '}';
    }
}

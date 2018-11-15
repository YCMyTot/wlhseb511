package com.wlhse.util;

import org.springframework.stereotype.Component;

@Component
public class StateCode {
    public final static int SUCCESS = 200;
    public final static int INSERT_FAILE = 300;
    public final static int DELETE_FAILE = 400;
    public final static int UPDATE_FAILE = 500;
    public final static int SELECT_FAILE = 600;

    private int state;
    private String stateName;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}

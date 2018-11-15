package com.wlhse.entity;

import org.springframework.stereotype.Component;

@Component
public class UserPojo {
    private Integer id;

    private String username;

    private String psw;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw == null ? null : psw.trim();
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}
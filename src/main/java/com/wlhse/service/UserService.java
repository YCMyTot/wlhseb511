package com.wlhse.service;

import com.wlhse.entity.UserPojo;

import java.util.List;


public interface UserService {
    List<UserPojo> AllUser();
    UserPojo AUserById(int id);
    int AddUser(UserPojo pojo);
    int deleteOneUser(int id);
    int updateUserService(UserPojo pojo);
}

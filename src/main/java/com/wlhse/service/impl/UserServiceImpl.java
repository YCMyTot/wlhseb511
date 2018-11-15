package com.wlhse.service.impl;

import com.wlhse.dao.UserPojoDao;
import com.wlhse.entity.UserPojo;
import com.wlhse.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserPojoDao dao;

    @Override
    public List<UserPojo> AllUser() {
        return dao.getAllUser();
    }

    @Override
    public UserPojo AUserById(int id) {
        return dao.getUserById(id);
    }

    @Override
    public int AddUser(UserPojo pojo) {
        return dao.insertUser(pojo);
    }

    @Override
    public int deleteOneUser(int id) {
        return dao.deletUser(id);
    }

    @Override
    public int updateUserService(UserPojo pojo) {
        return dao.updateUser(pojo);
    }
}

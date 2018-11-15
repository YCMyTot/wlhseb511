package com.wlhse.dao;

import com.wlhse.dto.TestDto;
import com.wlhse.dto.TestDto2;
import com.wlhse.entity.UserPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPojoDao {
    List<UserPojo> getAllUser();
    UserPojo getUserById(int id);
    int insertUser(UserPojo pojo);
    int deletUser(int id);
    int updateUser(UserPojo pojo);


    List<TestDto2> getTestDto(TestDto dto);
}
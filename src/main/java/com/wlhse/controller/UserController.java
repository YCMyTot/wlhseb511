package com.wlhse.controller;

import com.wlhse.entity.UserPojo;
import com.wlhse.service.UserService;
import com.wlhse.util.StateCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/UserController")
public class UserController {

    @Resource
    private StateCode code;

    @Resource
    private UserService service;

    @RequestMapping(value = "/User", method = RequestMethod.GET)
    @ResponseBody
    public List<UserPojo> returnUsers() {
        return service.AllUser();
    }

    @RequestMapping(value = "/User/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UserPojo returnAUser(@PathVariable("id") int id) {
        return service.AUserById(id);
    }

    @RequestMapping(value = "/User", method = RequestMethod.POST)
    @ResponseBody
    public StateCode addAUser(@RequestBody UserPojo pojo) {
        if (service.AddUser(pojo) == 1) {
            code.setState(StateCode.SUCCESS);
            code.setStateName("增加成功");
        } else {
            code.setState(StateCode.INSERT_FAILE);
            code.setStateName("增加失败");
        }
        return code;
    }

    @RequestMapping(value = "/TestUser", method = RequestMethod.GET)
    @ResponseBody
    public List<UserPojo> getFakeAllUser() {
        UserPojo pojo = new UserPojo();
        UserPojo pojo1 = new UserPojo();
        UserPojo pojo2 = new UserPojo();
        UserPojo pojo3 = new UserPojo();
        UserPojo pojo4 = new UserPojo();

        pojo.setId(1);
        pojo.setUsername("testUser1");
        pojo.setPsw("1");

        pojo1.setId(2);
        pojo1.setUsername("testUser2");
        pojo1.setPsw("12");

        pojo2.setId(3);
        pojo2.setUsername("testUser3");
        pojo2.setPsw("123");

        pojo3.setId(4);
        pojo3.setUsername("testUser4");
        pojo3.setPsw("1234");

        pojo4.setId(5);
        pojo4.setUsername("testUser5");
        pojo4.setPsw("123456");

        List<UserPojo> list = new ArrayList<>();
        list.add(pojo);
        list.add(pojo1);
        list.add(pojo2);
        list.add(pojo3);
        list.add(pojo4);

        return list;
    }


    @RequestMapping(value = "/User", method = RequestMethod.DELETE)
    @ResponseBody
    public StateCode deleteAUser(@RequestBody UserPojo pojo) {
        if (service.deleteOneUser(pojo.getId()) == 1) {
            code.setState(StateCode.SUCCESS);
            code.setStateName("删除成功");
        } else {
            code.setState(StateCode.DELETE_FAILE);
            code.setStateName("删除失败");
        }
        return code;
    }

    @RequestMapping(value = "/User", method = RequestMethod.PUT)
    @ResponseBody
    public StateCode UpdateAUser(@RequestBody UserPojo pojo) {
        if (service.updateUserService(pojo) == 1) {
            code.setState(StateCode.SUCCESS);
            code.setStateName("更新成功");
        } else {
            code.setState(StateCode.UPDATE_FAILE);
            code.setStateName("更新失败");
        }
        return code;
    }

//    @RequestMapping(value = "/User/encryption", method = RequestMethod.GET)
//    public void returnUsersEncryption(HttpServletResponse response) {
//        response.setContentType("text/html;charset=UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        List<UserPojo> list = service.AllUser();
//
//        try (
//                PrintWriter pw = response.getWriter()
//        ) {
//            pw.write(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
////        return service.AllUser();
//    }

}

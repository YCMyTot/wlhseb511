package com.wlhse.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wlhse.dao.ProblemSourceDao;
import com.wlhse.dao.UserPojoDao;
import com.wlhse.dto.TestDto;
import com.wlhse.dto.TestDto2;
import com.wlhse.entity.ProblemSourcePojo;
import com.wlhse.entity.UserPojo;
import com.wlhse.service.UserService;
import com.wlhse.util.JedisUtil;
import com.wlhse.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/*.xml"})
public class hg_test {

    @Resource
    private UserPojoDao dao;


    @Resource
    private ProblemSourceDao dao1;

    @Resource
    private UserService service;

    @Resource
    private UserPojo pojo;

    @Resource
    private ProblemSourcePojo pojo1;

    @Test
    public void getAllUser_test() {
        System.out.println(dao.getAllUser());
    }

    @Test
    public void AllUser_test() {
        System.out.println(service.AllUser());
    }

    @Test
    public void getUserById_test() {
        int id = 1;
        System.out.println(dao.getUserById(id).toString());
    }

    @Test
    public void AUserById_test() {
        int id = 1;
        System.out.println(service.AUserById(id));
    }

    @Test
    public void insertUser_test() {
        pojo.setUsername("userTest11");
        pojo.setPsw("123");
        System.out.println(dao.insertUser(pojo));
    }

    @Test
    public void AddUser_test() {
        pojo.setUsername("userTest22");
        pojo.setPsw("123");
        System.out.println(service.AddUser(pojo));
    }

    @Test
    public void deletUser_test() {
        int id = 8;
        System.out.println(dao.deletUser(id));
    }

    @Test
    public void deleteOneUser_test() {
        int id = 9;
        System.out.println(service.deleteOneUser(id));
    }

    @Test
    public void updateUser_test() {
        pojo.setId(4);
        pojo.setUsername("updateTest");
        pojo.setPsw("321");

        System.out.println(dao.updateUser(pojo));
    }

    @Test
    public void updateUserService_test() {
        pojo.setId(4);
        pojo.setUsername("updateTest");
        pojo.setPsw("123");

        System.out.println(service.updateUserService(pojo));
    }

    @Test
    public void MD5Util_test() {
        pojo.setId(4);
        pojo.setUsername("updateTest");
        pojo.setPsw("123");

        String pojoString = pojo.toString();
        String MD5pojoString = MD5Util.MD5Encode(pojoString, "UTF-8");
        System.out.println(MD5pojoString);
    }

    @Test
    public void queryProblemSource_test() {
        System.out.println(dao1.queryProblemSource());
    }

    @Test
    public void updateProblemSource_test() {
        pojo1.setProblemSourceID(1);
        pojo1.setProblemSourceName("温度过低1234");
        dao1.updateProblemSource(pojo1);
    }

    @Test
    public void PageHelper_test(){
        PageHelper.startPage(1, 2);
        List<ProblemSourcePojo> list = dao1.queryProblemSource();
        for(ProblemSourcePojo pojo2 : list){
            System.out.println(pojo2.toString());
//            List<Country> list;
//            if(param1 != null){
//                PageHelper.startPage(1, 10);
//                list = countryMapper.selectIf(param1);
//            } else {
//                list = new ArrayList<Country>();
//            }
        }
    }

    @Test
    public void deleteProblemSource_test() {
        pojo1.setProblemSourceID(6);
        dao1.deleteProblemSource(pojo1);
    }

    @Test
    public void insertProblemSource_test() {
        pojo1.setProblemSourceCode("3");
        pojo1.setProblemSourceName("温度正常");
        dao1.insertProblemSource(pojo1);
    }

    @Test
    public void insertManyProblemSource_test() {
        ProblemSourcePojo pojo11=new ProblemSourcePojo();
        ProblemSourcePojo pojo12=new ProblemSourcePojo();
        ProblemSourcePojo pojo13=new ProblemSourcePojo();

        pojo11.setProblemSourceCode("1");
        pojo11.setProblemSourceName("温度太高！");

        pojo12.setProblemSourceCode("2");
        pojo12.setProblemSourceName("温度太高2！");

        pojo13.setProblemSourceCode("3");
        pojo13.setProblemSourceName("温度太高3！");

        List<ProblemSourcePojo> list=new ArrayList<>();
        list.add(pojo11);
        list.add(pojo12);
        list.add(pojo13);
        dao1.insertManyProblemSource(list);

    }
    @Test
    public void queryProblemSourceByCondition_test() {
        pojo1.setProblemSourceName("温度过低123");
        List<ProblemSourcePojo> list= dao1.queryProblemSourceByCondition(pojo1);
        System.out.println(list);

    }
    @Test
    public void queryProblemSourceByVagueCondition_test() {
        List<ProblemSourcePojo> list= dao1.queryProblemSourceByVagueCondition("温度过低");
        System.out.println(list);
    }

    @Test
    public void test_test() {
        TestDto testDto=new TestDto();
        testDto.setProblemSourceName("温度过低1234");
        testDto.setTest1("222");
        List<TestDto2> list=dao.getTestDto(testDto);
        System.out.println(list);
    }

    @Test
    public void JedisUtil_test() {
        JedisUtil jedisUtil=new JedisUtil();
//        jedisUtil.putJedis();
        jedisUtil.getJedis();
    }

}

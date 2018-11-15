package com.wlhse.dao;

import com.wlhse.entity.ProblemSourcePojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:
 * @Despriction:
 * @Data: 2018/11/13 15:44
 */
public interface ProblemSourceDao {
    List<ProblemSourcePojo> queryProblemSource();

    int updateProblemSource(ProblemSourcePojo pojo);

    int deleteProblemSource(ProblemSourcePojo pojo);

    int insertProblemSource(ProblemSourcePojo pojo);

    int insertManyProblemSource(List<ProblemSourcePojo> list);

    List<ProblemSourcePojo> queryProblemSourceByCondition(ProblemSourcePojo pojo);

    List<ProblemSourcePojo> queryProblemSourceByVagueCondition(@Param("keyword") String keyword);
}

package com.darkgo.jdbcmultidatasource.dao;

import java.util.List;
import java.util.Map;

/**
 * @ClassName MasterStudentDao
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/31
 * @Version V1.0
 **/
public interface ClusterStudentDao {
    List<Map<String, Object>> getAllStudents();
}
